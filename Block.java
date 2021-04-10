package JoeFishCoin;

import java.util.LinkedList;


class Block {
   private /*byte[]*/String hash;
   private /*byte[]*/String previousBlockHash;
   
   private int data;
   
   Block(String h, String p, int d) {
      hash = h;
      previousBlockHash = p;
      data = d;
      
   }
   
   public String getHash(){
      return hash;
   }
   
   public int getData(){
      return data;
   }

}

