package JoeFishCoin;

import java.util.LinkedList;



class JoeFishCoin { 
    public static void main(String args[]) { 
        Blockchain JoeFishCoin = new Blockchain();
        JoeFishCoin.addBlock( "2", 2 );
        
        System.out.println(JoeFishCoin.getLatestBlock().getData() );
    } 
    
}