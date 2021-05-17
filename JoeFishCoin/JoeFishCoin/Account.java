package JoeFishCoin;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;


class Account {
    String PublicName; 
    PrivateKey privateKey;
    private PublicKey publicKey;

    Account() throws NoSuchAlgorithmException{
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        privateKey = keyPair.getPrivate();
        publicKey = keyPair.getPublic();
        PublicName = "";
    }

    Account(String name)throws NoSuchAlgorithmException{
        this();
        PublicName = name;
    }

    PublicKey getPublicKey(){
        return publicKey;
    }


}