package JoeFishCoin;

import java.util.Date;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;

public class Transaction {
    private PublicKey sender;
    private PublicKey reciever;
    private double amount;
    private Date date;

    public Transaction(PublicKey s, PublicKey r, double a) {
        sender = s;
        reciever = r;
        amount = a;
        date = new Date();
    }

    public PublicKey getSender(){
        return sender;
    }

    public PublicKey getReciever(){
        return reciever;
    }
    
    public double getAmount(){
        return amount;
    }

    public String toString(){
        return sender.toString() +" "+ reciever.toString() +" "+ String.valueOf(amount) +" "+ date;
    }
    
}
