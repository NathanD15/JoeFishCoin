package JoeFishCoin;

import java.security.NoSuchAlgorithmException; 

class Block {
   private byte[] hash;
   private byte[] previousBlockHash;
   
   private int data;
   
   Block(String h, String p, int d) throws NoSuchAlgorithmException {
      data = d;
      hash = this.CreateBlockHash();
      previousBlockHash = Hash.SHA256(p);
   }
   
   Block(String h, byte[] p, int d) throws NoSuchAlgorithmException {
      data = d;
      hash = this.CreateBlockHash();
      previousBlockHash = p;
   }

   public byte[] CreateBlockHash(){
      try {
         return Hash.SHA256( String.valueOf(data) );
      } catch (NoSuchAlgorithmException e) {
         e.printStackTrace();
         return new byte[0] ;
      }
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

