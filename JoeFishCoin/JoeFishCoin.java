package JoeFishCoin;

import java.security.NoSuchAlgorithmException; 


class JoeFishCoin { 
    public static void main(String args[]) throws NoSuchAlgorithmException { 
        Blockchain JoeFishCoin = new Blockchain();
        JoeFishCoin.addBlock( "2", 2 );
        JoeFishCoin.addBlock( "3", 3 );

        System.out.println("Data :  " + JoeFishCoin.getBlockAtIndex(1).getHash() );
        System.out.println("Data :  " + JoeFishCoin.getBlockAtIndex(2).getHash() );

        System.out.println("Hash :  " + JoeFishCoin.getLatestBlock().getHash() );
    } 
    
}