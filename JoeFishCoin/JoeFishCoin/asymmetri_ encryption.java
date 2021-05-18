package JoeFishCoin;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;


class asymmetric_encryption
{
	/*public static void main(String[] args) throws Exception {
		String plainText = "Hello World!";
 
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        
        
        byte[] encryptedText = encrypt(plainText.getBytes(), publicKey);
        byte[] descryptedText = descrypt(encryptedText, privateKey);

        System.out.println("input: " + plainText);
        System.out.println("encrypted: " + encryptedText);
        System.out.println("decrypted: " + new String(descryptedText) );
	}*/

    public static byte[] encrypt(byte[] data, PublicKey publicKey) throws Exception{
        Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(data);
    }

    public static byte[] descrypt(byte[] encryptedData, PrivateKey privateKey) throws Exception{
        Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(encryptedData);
    }

    public static boolean isValidKey(PublicKey publicKey, PrivateKey privateKey)throws Exception{
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateK = keyPair.getPrivate();
        PublicKey publicK = keyPair.getPublic();


        String str1 = new String( descrypt( encrypt("Valid Key".getBytes(), publicKey) , privateKey) );
        String str2 = new String( descrypt( encrypt("Valid Key".getBytes(), publicK) , privateK) );

        return str1.equals(str2);
    }

}
