package JoeFishCoin;

import java.util.Date;

public class Transaction {
    private String sender;
    private String reciever;
    private double amount;
    private Date date;


    public Transaction(String s, String r, double a) {
        sender = s;
        reciever = r;
        amount = a;
        date = new Date();
    }

    public String getSender(){
        return sender;
    }

    public String getReciever(){
        return reciever;
    }
    
    public double getAmount(){
        return amount;
    }

    public String toString(){
        return sender +" "+ reciever +" "+ String.valueOf(amount) +" "+ date;
    }
    
}
