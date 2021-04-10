package JoeFishCoin;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest; 

import java.security.NoSuchAlgorithmException; 
import java.lang.Math;
 

class Hash { 
    public static byte[] SHA256(String input) throws NoSuchAlgorithmException
    { 
        MessageDigest md = MessageDigest.getInstance("SHA-256"); 
        return md.digest(input.getBytes(StandardCharsets.UTF_8)); 
    }
    
    public static String toString(byte[] hash) {
    
         String h = "";
         int bit; 
         byte old;
        for(int i = 0;i < hash.length;i++){
            old = hash[i];
            bit = 0;
            for(int j = 0; j < 8; j++){
               bit = hash[i] %2;
               hash[i] /= 2;
               h += String.format("%d", Math.abs(bit) );
            }
            hash[i] = old;
            
        }
        
        return h; 
    }
  
    /*public static void main(String args[])
    { 
        try 
        {
            String str1 = "hello world"; 
            System.out.println(str1 + " = " + toString(SHA256(str1))); 
        
            String str2 = "testing    "; 
            System.out.println(str2 + " = " + toString(SHA256(str2))); 
        }
        catch (NoSuchAlgorithmException e) { 
        } 
    } */
    
}