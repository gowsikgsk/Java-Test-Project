package array;

public class String_toStringArray_ReverseElements {
/**** program to convert String To String Array without using Spilt Function***/
	static String S = "i love java";
	static void rev() {
		String temp = "";
		int counter = 0;
		char cc[] = S.toCharArray();
		for (int j = 0; j <= cc.length - 1; j++) // for to count the space and word
		{
			if (cc[j] == ' ') {
				counter = counter + 1;
			}
		}

		int j = 0; // initilze j for String Array Increment
		String G[] = new String[counter + 1];// space +1=word present i the String
		for (int k = 0; k <= cc.length - 1; k++) {
			if (cc[k] == ' ') // this condition allows only cc[k] equal to space ' '
			{
				G[j] = temp;
				j++; // for increment the String Array
				temp = ""; // empty the temp
			} else {
				temp = temp + cc[k]; // this else only allow letters not space
			}
		} // for loop
		G[j] = temp; // G[3]=temp(java) , for last itertion "java" stored to temp
 
//		for (int x = 0; x <= G.length - 1; x++) {
//		 System.out.print(G[x]); // to print the String Array G[]
//		}
    for(int w = 1 ; w <G.length;w++) 
    {
	G[w]=G[w]+" ";    //we add space from 1st index o/p like [ilove java ] .
    }
		/***************** To Reverse Element in String Array ********************/

		char cr[] = new char[cc.length]; // declare cr array length (cc.length)
		
		for (String s : G) {     // normal for loop for (int x=0;x<G.length;x++) {
		cr = s.toCharArray(); // convert every String Array iteration to char Array
		for (int i = 0; i < cr.length / 2; i++) 
		{ 
			char temper = cr[i];
			cr[i] = cr[cr.length - i - 1];  //Transverse char array 
			cr[cr.length - i - 1] = temper;
		}
		for (char g : cr) {
			System.out.print(g);
		}// print char array 
		
        /*----else we print the reversly get the o/p--------*/		
		/*for (int w = cr.length-1; w >= 0 ; w--) 
		    {
				System.out.print(cr[w]);
			}*/
		} // k for outer for
	}/*Static method*/
public static void main(String[] args) {
		rev(); // method calling
	}
}
