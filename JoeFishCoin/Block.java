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
   
   Block(String h, byte[] p, int d) throws NoSuchAlgorithmException {
      hash = Hash.SHA256(h);
      previousBlockHash = p;
      data = d;
   }

   public byte[] getPreviousBlockHash(){
      return previousBlockHash;
   }

   public String getPreviousBlockHashString(){
      return Hash.toString(previousBlockHash);
   }


   public byte[] getHash(){
      return hash;
   }
   
   public String getHashString(){
      return Hash.toString(hash);
   }

   public int getData(){
      return data;
   }

}

