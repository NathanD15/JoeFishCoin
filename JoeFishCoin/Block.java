package JoeFishCoin;

import java.security.NoSuchAlgorithmException; 

class Block {
   private byte[] hash;
   private byte[] previousBlockHash;
   
   private Transaction[] transactions;
   
   Block(String h, String p, Transaction[] f) throws NoSuchAlgorithmException {
      transactions = f;
      hash = this.CreateBlockHash();
      previousBlockHash = Hash.SHA256(p);
   }
   
   Block(String h, byte[] p, Transaction[]  f) throws NoSuchAlgorithmException {
      transactions = f;
      hash = this.CreateBlockHash();
      previousBlockHash = p;
   }

   public byte[] CreateBlockHash(){
      try {
         return Hash.SHA256( String.valueOf(transactions.get) );
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

