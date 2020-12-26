package array;

public class Sorting_StringArray {
	static String G[]= {"DHKF","EGI","ACBJ","adcb"};
	static String Y=new String();
	
	   static void Sorting()
	     {
		     for (int i=0;i<G.length;i++) 
		     {
		    	 Y=Y+G[i];// Convert String Array To String 
		     }
		     char SS[]=Y.toCharArray();         
		     char temp;
		     
		   for (int i=0;i<SS.length;i++) {
			   for (int j=i+1;j<SS.length;j++) {
                      if (SS[i]>SS[j]) //compare AScii Codes 
                      {
                    	temp=SS[i];
                    	SS[i]=SS[j]; //swapping 
                    	SS[j]=temp;
                      }//if
			       }//inner for
 	            }// outer for 
		   
		   for (int i=0;i<SS.length;i++)
		      {
			   System.out.print(SS[i]);// print Char Array
		      } 
	    	 
	     }

	public static void main(String[] args) {
	         	Sorting();
	}

}
