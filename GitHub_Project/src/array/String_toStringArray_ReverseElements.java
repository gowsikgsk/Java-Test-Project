package array;
public class String_toStringArray_ReverseElements {
	/***************** program to convert String To String Array without using Spilt Function********************/ 
	static void rev() {
 	   String S = "i love java"; 
 	   String temp="";
 	   int counter =0;
 	   char cc[]=S.toCharArray();
 	   for (int j=0;j<=cc.length-1;j++) // for to count the space and word
 	   {
         	if (cc[j]==' ') 
         	{
         		counter =counter+1;           		
         	}
   		}
 	   
 	   int j=0;
 	   String G[] = new String[counter+1];// space +1=word present i the String
 	   for (int k=0;k<=cc.length-1;k++) 
 	   { 
 		   if(cc[k]==' ') // this condition allows only cc[k] equal to space ' ' 
 		   {
 			   G[j]=temp+cc[k]; 
 			   j++;  // for increment the String Array 
 			   temp=""; // empty the temp 
 		   }
 		   else {
 			   temp=temp+cc[k]; // this else only allow letters not space 
 		   }
 	   }// for loop
 	  G[j]=temp; // G[3]=temp(java) , for last itertion "java" stored to temp 
 	   
 	   for (int x=0;x<=G.length-1;x++)
   	    { 
         	//System.out.print(G[x]); // to print the String Array G[]
   		}  
 /*****************To Reverse Element ********************/ //reverse not working fully 	   
 	   char cr[]=new char[cc.length]; // declare cr array length (cc.length)
 	   
 	   for(int i=0;i<G.length;i++)
 	   {
 	      cr=G[i].toCharArray(); // G[o] convert to char array
 	      for(int s=0;s<G[i].length()/2;s++) // Transverse 
 	      {
 	    	  char temper=cr[s];
 	    	  cr[s]=cr[G[i].length()-s-1];
 	    	 cr[G[i].length()-s-1]=temper;
 	      } //for loop s
 	   
 	   }//for loop i
 	   
 	  for(int i=0;i<cr.length;i++)
	   {
 		  System.out.print(cr[i]); //to print char array cr 
	   }
 	   
    }

	public static void main(String[] args) {
		rev(); // method calling 

	}

}

/*  for(int g=G[i].length()-1;g>=0;g--)
  {
  
   /* try { 
 		 }
 		  catch(Exception ec)
 		  {
 			  System.out.println(ec);
 		  }*/

//	  cr[G[i].length()-i-1]=G[i];
 // }  */