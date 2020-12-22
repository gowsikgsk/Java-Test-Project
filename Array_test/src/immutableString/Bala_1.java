package immutableString; // To Remove All Space an String & Store the  Same String Reference
public class Bala_1 {
	static String s = new String(" G OW SI K "); // Input String 
	static int counter = 0; 
	static void lla()
	{  // To find Not Space Elements 
		 for(int i=0; i<s.length(); i++) 
		 {
	         if (s.charAt(i)!=32)
	         {
	             counter=counter+1;
          	  }//if 
	      }//for	
    }// method lla 
	
	public static void main(String[] args) 
	{     
		lla();  // static Method calling 
	      char a[] = new char[s.length()];
	      int counter1=0; //local variable 
		         char d;
		         int j=0;
		         for(int i=0; i<a.length; i++)
		         { 
		        	 if (s.charAt(i)!=32)// this condition  allows except space        // if (s!=s.subSequence(1, 4));
		        		 {
		  	              d=s.charAt(i); // convert String Elements to Char Array 
		  	               a[j]=d;
		  	               j++;
		  	             counter1=counter1+1;// for testing purpose only 
		  	             }//if
		         }// for 
		     //    System.out.println(counter1); //charator count
		         
		s=""; // to empty S String 
		
	   for(int i=0;i<a.length;i++)
	      {
	       s=s+a[i]; // To Convert char Array to String 
	      }// for loop
	   
	  System.out.println(s); // To Print String 
	  System.out.println("without space elements "+counter);
	}
}
    // =------------To Print Char Array---------=//
 /* for(int i=0; i<a.length; i++)
{
	System.out.print(a[i]); // printing char array
}   */
// ---------------- Trash codess------------------------------------------------------------------------
////if(	s .substring(s.charAt(1),s.length()-1))



//    if(s.charAt(i)==s.charAt(0)||s.charAt(i)==s.charAt(s.length()-1))     //&&s.charAt(i)<s.charAt(s.length()-1))
//   {
 	  //if (s.charAt(i)!=32&&s.charAt(0)!=32) {//&&s.charAt(i)!=s.charAt(s.length()-1)) {


// ( a[i]!=s.charAt(0)&&a[i]!=s.charAt(s.length()-1)&&a[i]!=32)
//	 if(s.charAt(0)==32&&s.charAt(s.length()-1)==32) {
//&&s.charAt(i)!=32) //&&s.charAt(i)!=s.charAt(s.length()-1)
/*  for(int i=0; i<s.length(); i++)
{
 if (s.charAt(i)!=32)
    {
   counter=counter+1;
    }
}
*/

/*  for(int i=0; i<a.length; i++)
{
//	System.out.print(a[i]);
} */
//if(s.charAt(i)!=' ') //// s.subSequence(0, 5);// if (s.contains("t"))
