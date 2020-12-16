package array;              // Reverse char Array (a) using another new char Array (b)
public class Reverse_Array 
{ 
	void G()
	{
	char[] a= {'T','E','N','e', 't'};
	 char[] b=new char [a.length];
	  for (int i=a.length-1;i>=0;i--) //  decrement i value
	  {
         for (int j=0;j<=b.length-1;j++)  //  increment j value 
           {
	         if(j==a.length-i-1)   // this condition ensure  j i  04  13  22  31  40 to reverse array
	           {
		     b[j]=a[i];
		    
		       }
	       }//inner for 
	 } //outer for
	  
	  // To Print The new Array b
	 for (int j=0;j<=b.length-1;j++)
	    { 
      	System.out.print(b[j]);
		}
	}
	public static void main(String[] args)
	  {
		Reverse_Array arr=new Reverse_Array();
		arr.G();   
	  }
}
