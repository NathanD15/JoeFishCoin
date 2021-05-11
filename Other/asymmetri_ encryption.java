import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;


public class asymmetric_encryption
{
	public static void main(String[] args) throws Exception {
		String plainText = "Hello World!";
 
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        
        //System.out.println("Private Key:" + privateKey.getEncoded() +"\n");
        //System.out.println("Public Key:"  + publicKey.getEncoded()  +"\n");
        
        
        
        Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedData = cipher.doFinal(plainText.getBytes() );
        String encryptedText = new String(encryptedData);
        cipher = null;
        
        cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] descryptedData = cipher.doFinal(encryptedData );
        String descryptedText = new String( descryptedData );
 
        System.out.println("input: " + plainText);
        System.out.println("encrypted: " + encryptedText);
        System.out.println("decrypted: " + descryptedText);
	}


}
