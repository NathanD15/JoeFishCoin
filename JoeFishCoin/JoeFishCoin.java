package JoeFishCoin;

import java.security.NoSuchAlgorithmException; 


class JoeFishCoin { 
    public static void main(String args[]) throws NoSuchAlgorithmException { 
        Blockchain JoeFishCoin = new Blockchain();
        JoeFishCoin.addBlock( "2", 2 );
        JoeFishCoin.addBlock( "3", 3 );

        System.out.println("Hash :  " + JoeFishCoin.getBlockAtIndex(1).getHashString() );
        System.out.println("Hash :  " + JoeFishCoin.getBlockAtIndex(2).getPreviousBlockHashString() );
        System.out.println("Valid:  " + JoeFishCoin.isValid() );
        //System.out.println("Hash :  " + JoeFishCoin.getBlockAtIndex(3).getHash() );
        //System.out.println("Hash :  " + JoeFishCoin.getLatestBlock().getHash() );
    } 
    
}