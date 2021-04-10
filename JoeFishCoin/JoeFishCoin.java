package JoeFishCoin;

import java.security.NoSuchAlgorithmException; 


class JoeFishCoin { 
    public static void main(String args[]) throws NoSuchAlgorithmException { 
        Blockchain JoeFishCoin = new Blockchain();
        JoeFishCoin.addBlock( "2", 2 );
        JoeFishCoin.addBlock( "3", 3 );

        //getHash
        //getData

        System.out.println("Hash :  " + JoeFishCoin.getBlockAtIndex(0).getHash() );
        System.out.println("Hash :  " + JoeFishCoin.getBlockAtIndex(1).getHash() );
        System.out.println("Hash :  " + JoeFishCoin.getBlockAtIndex(2).getHash() );
        System.out.println("Hash :  " + JoeFishCoin.getLatestBlock().getHash() );
    } 
    
}