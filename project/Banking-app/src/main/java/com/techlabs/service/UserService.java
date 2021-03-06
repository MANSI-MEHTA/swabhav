package com.techlabs.service;

import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.User;
import com.techlabs.repo.UserRepo;

@Service("userservice")
public class UserService {
	private final byte[] keyValue =
            new byte[]{'T', 'h', 'e', 'B', 'e', 's', 't', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};
	@Autowired
	private UserRepo user_repo;

	public User authenticateUser(String username, String password) {
		return this.user_repo.AuthenticateUser(username, password);
	}

	public boolean checkUserExists(String email) {
		return this.user_repo.checkUserExists(email);
	}

	public void registerUser(User user) {
		this.user_repo.registerUser(user);
	}

	public User getUserByAcc_no(long acc_no) {
		return this.user_repo.getUserByAcc_no(acc_no);
	}

	public void changeToActivateState(User user) {
		this.user_repo.changeToActivateState(user);
	}
	public User getUserByUserName(String username){
		return this.user_repo.getUserByUserName(username);
	}
	public void changeToLockedState(User user){
		this.user_repo.changeToLockedState(user);
	}
	public List<User> getAllUsers(){
		return this.user_repo.getAllUsers();
	}
	
	public UserRepo getUser_repo() {
		return user_repo;
	}

	@Autowired
	public void setUser_repo(UserRepo user_repo) {
		this.user_repo = user_repo;
	}

	public SecretKey getSecretEncryptionKey() throws Exception {
//		KeyGenerator generator = KeyGenerator.getInstance("AES");
//		generator.init(128); // The AES key size in number of bits
		SecretKey secKey =new SecretKeySpec(keyValue, "AES") ;
		return secKey;
	}

	public byte[] encryptText(String plainText, SecretKey secKey)
			throws Exception {
		// AES defaults to AES/ECB/PKCS5Padding in Java 7
		Cipher aesCipher = Cipher.getInstance("AES");
		aesCipher.init(Cipher.ENCRYPT_MODE, secKey);
		byte[] byteCipherText = aesCipher.doFinal(plainText.getBytes());
		return byteCipherText;
	}

	public String decryptText(byte[] byteCipherText, SecretKey secKey)
			throws Exception {
		// AES defaults to AES/ECB/PKCS5Padding in Java 7
		Cipher aesCipher = Cipher.getInstance("AES");
		aesCipher.init(Cipher.DECRYPT_MODE, secKey);
		byte[] bytePlainText = aesCipher.doFinal(byteCipherText);
		return new String(bytePlainText);
	}

	public  String bytesToHex(byte[] hash) {
		return DatatypeConverter.printHexBinary(hash);
	}
}
