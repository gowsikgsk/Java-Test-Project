package array;
import java.io.*;
import java.util.*;
public class StringConverter {
  /* public static void printBytes(byte[] array, String name) {
	   String o="";
      for (int k = 0; k < array.length; k++) {
Object UnicodeFormatter;
//System.out.println(name + "[" + k + "] = " + "0x" +((Object) UnicodeFormatter).byteToHex(array[k]));
    //	o=UniCodeFormatter.byteToHex(array[k]);
      }
   }*/
   public static void main(String[] args) {
	   String G="ABC";
       char c[]=G.toCharArray();
       int x = 40;
		for (int i = 0; i < c.length; i++) {
			
			c[i] = (char) (c[i] + x);
			int temp=(c[i]);
			x = x +496;
			System.out.print(c[i] + "  "+temp+"   ");
			temp=0;
		}
	   
      System.out.println(System.getProperty("file.encoding"));
      String original = new String("A" + "\u0B83" + "\u00f1"
                              + "\u00fc" + "C");
   //   System.out.println("original = " + original);
      System.out.println();
      try {
          byte[] utf8Bytes = original.getBytes("UTF8");
          byte[] defaultBytes = original.getBytes();
 
          String roundTrip = new String(utf8Bytes, "UTF8");
       //    System.out.println("roundTrip = " + roundTrip);
          System.out.println();
        /*  printBytes(utf8Bytes, "utf8Bytes");
          System.out.println();
          printBytes(defaultBytes, "defaultBytes");*/
      } catch (UnsupportedEncodingException e) {
          e.printStackTrace();
      }
   } // main

}