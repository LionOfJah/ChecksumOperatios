package com.icicibank.apimgmt.service.impl;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Formatter;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icicibank.apimgmt.model.ResponseModel;
import com.icicibank.apimgmt.model.VerifyResponseModel;
import com.icicibank.apimgmt.service.ChecksumOperationsService;

@Service
public class ChecsumOperationsServiceImpl implements ChecksumOperationsService {

	private static final String ALGTHM_TYPE_AES = "AES";
    private static final String ALGTHM_CBC_PAD_AES = "AES/CBC/PKCS5PADDING";
    private static final String ALGTHM_PROVIDER_BC = "SunJCE";
    private static final byte[] ivParamBytes = {'@', '@', '@', '@', '&', '&', '&', '&', '#', '#', '#', '#', '$', '$', '$', '$'};

    @Autowired
    ResponseModel responseModel;
    
    @Autowired
    VerifyResponseModel verifyResponseModel;
	@Override
	public ResponseModel generateChecksum(String params,String key) throws Exception {
			String salt = generateRandomString(4);
	         responseModel.setCheckSumValue(calculateChecksum(params, key, salt));
	        return responseModel;
	}

	@Override
	public VerifyResponseModel verifyChecksum(String params,String key,String checkSum) throws Exception {
		String paytm_hash = decrypt(checkSum, key);
        String salt = paytm_hash.substring(paytm_hash.length() - 4);
        String calculatedHash = calculateHash(params, salt);
        verifyResponseModel.setVerifyStatus(""+paytm_hash.equals(calculatedHash)); 
		return verifyResponseModel;
	}

	private  String generateRandomString(int length) {
        String ALPHA_NUM = "9876543210ZYXWVUTSRQPONMLKJIHGFEDCBAabcdefghijklmnopqrstuvwxyz!@#$&_";
        StringBuilder random = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int ndx = (int) (Math.random() * ALPHA_NUM.length());
            random.append(ALPHA_NUM.charAt(ndx));
        }
        return random.toString();
    }
	
	private  String calculateChecksum(String params, String key, String salt) throws Exception {
        String hashString = calculateHash(params , salt);
        String checksum = encrypt(hashString, key);
        if (checksum != null) {
            checksum = checksum.replaceAll("\r\n", "")
                    .replaceAll("\r", "")
                    .replaceAll("\n", "");

        }
        return checksum;
    }
	
	public  String encrypt(String input,String key) throws Exception {
        String encryptedValue = "";
        Cipher cipher = Cipher.getInstance(ALGTHM_CBC_PAD_AES,ALGTHM_PROVIDER_BC);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes(), ALGTHM_TYPE_AES),new IvParameterSpec(ivParamBytes));
        byte[] baseEncodedByte = Base64.getEncoder().encode(cipher.doFinal(input.getBytes()));
        encryptedValue = new String(baseEncodedByte);
        return encryptedValue;
    }
	private static String calculateHash(String params, String salt) throws Exception {
        String finalString = params + "|" + salt;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Formatter hash = new Formatter();
        for (byte b : messageDigest.digest(finalString.getBytes())) {
            hash.format("%02x", b);
        }
        
        return hash.toString().concat(salt);
    }
	public  String decrypt(String input, String key) throws Exception {
        String decryptedValue = "";
        Cipher cipher = Cipher.getInstance(ALGTHM_CBC_PAD_AES,ALGTHM_PROVIDER_BC);
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key.getBytes(), ALGTHM_TYPE_AES),new IvParameterSpec(ivParamBytes));
        byte[] baseDecodedByte = Base64.getDecoder().decode(input);
        decryptedValue = new String(cipher.doFinal(baseDecodedByte));
        return decryptedValue;
    }
	

}
