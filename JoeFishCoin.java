package JoeFishCoin;

import java.util.LinkedList;
import java.security.NoSuchAlgorithmException; 


class JoeFishCoin { 
    public static void main(String args[]) throws NoSuchAlgorithmException { 
        Blockchain JoeFishCoin = new Blockchain();
        JoeFishCoin.addBlock( "2", 2 );
        
        System.out.println("Data :  " + JoeFishCoin.getLatestBlock().getData() );
        System.out.println("Hash :  " + JoeFishCoin.getLatestBlock().getHash() );
    } 
    
}