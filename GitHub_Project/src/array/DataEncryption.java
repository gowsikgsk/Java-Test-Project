/* This Program is Small Encryption Program
 * we give input 'A' means output will Be 'B'  ('A'+1='B'),likewise('B'+2='D'),('C'+3='F')  
 * for this program i used Ascii Table 
 * 'A' Ascii Value is 65 , 65+1=66, 66 corresponding 'B' 
 * Same like 'Z' Asci Value 90+26=116,116 Corresponding Ascii Char is 't' 
 * char   Ascii Value ||   char      Ascii Value  
 * A        65        ||     a          97		 
 * |   to    |        ||     |           |        || Refer ASCII Table 
 * Z        90        ||     z          122                               */

package array;
public class DataEncryption {
	         char[] alg() // Method with Return type
	{
		char g[] = { 'A', 'B', 'C', 'X', 'Y', 'Z' };
		int n = 0;
		for (int i = 0; i < g.length; i++) 
		  {
			n = (char) (g[i] - 64); // A ASCII Value 65,so 65-64=1 local variable will be saved in n
			g[i] =  (char) (g[i] + n); // we add n in to char 65+1=66, using (char) keyword n will consider as Ascii  
		  }// for 
		
		for (int i = 0; i < g.length; i++) {
			System.out.print(" "+g[i]);          // Print g[ ] char Array 
		}
		return g; //using return we can print o/p inside main method 
		}
	         
	public static void main(String[] args) {
		DataEncryption encrypt=new DataEncryption();
		//System.out.println(encrypt.alg()); // using return g
		encrypt.alg(); // Method calling 
	}
}
