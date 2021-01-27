/*small encryption decryption tested out with Two Variables x,j  using UTF-8*/
package array;
public class Encryptions {
	private static void Encryption (String G, char[] c ) 
	{
           long x = 40l;
	       int j=1;
	       System.out.print(G); //to print given input
	       System.out.println(); 
	       
			for (int i = 0; i < c.length; i++) {
				c[i] = (char) ((c[i] + x)*j);
				x = x +19; // add x variable for `encryption 
				j=j+1;// another variable 
				System.out.print(c[i] + "  ");
			}
/* after converted original char into encrypted format ,reverse char array */
			for (int i = 0; i < c.length / 2; i++) 
			{ 
				char temper = c[i];
				c[i] = c[c.length - i - 1];  
				c[c.length - i - 1] = temper;
			}
			 System.out.println();
/* to print encryted & reverse char array */	 
			for (int i = 0; i < c.length; i++) 
			{
				System.out.print(c[i]);  
			}
			System.out.println();		
	}
	
	private static void Decryption (char[] c )  // to restrict access from another class
	{
/* reverse char array in order to decrypt*/
		for (int i = 0; i < c.length / 2; i++) 
		{ 
			char temper = c[i];
			c[i] = c[c.length - i - 1];  
			c[c.length - i - 1] = temper;
		}
		
	long x = 40l;
	int	j=1;
		for (int i = 0; i < c.length; i++) {
			c[i] = (char) ((c[i] - (x*j))/j);
			x = x +19;
			j=j+1;
			//System.out.print(c[i] + " ");//+(int)c[i]+" "
		}
/* to print encryted & reverse char array */		
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]);
		}
	
	}
	public static void main(String[] args) {
		 String G="gowsik@protipn)23879^%$";// INPUT
		 char c[]=G.toCharArray();
		 Encryption(G,c); //Method calling
		 Decryption(c); // Method calling
	}
}
