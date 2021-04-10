package JoeFishCoin;

import java.security.NoSuchAlgorithmException; 

class Block {
   private byte[] hash;
   private byte[] previousBlockHash;
   
   private int data;
   
   Block(String h, String p, int d) throws NoSuchAlgorithmException {
      hash = Hash.SHA256(h);
      previousBlockHash = Hash.SHA256(p);
      data = d;
   }
   
   public String getPreviousBlockHash(){
      return Hash.toString(previousBlockHash);
   }

   public String getHash(){
      return Hash.toString(hash);
   }
   
   public int getData(){
      return data;
   }

}

