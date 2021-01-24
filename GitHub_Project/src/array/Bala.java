package array;
public class Bala {
	void ba()
	{
		String s=new String(" gsk is pen tester ");
		char a[]=s.toCharArray();
		/*int counter =0;
		 for(int i=0; i<a.length; i++) 
		 {
	         if (a[i]!=32)
	         {
	             counter=counter+1;
          	  }//if 
	      }//for
		 char b[]=new char[counter];
		 int j=0;
	     for(int i=0;i<a.length;i++) 
	     {
			if (a[i] !=' ')
			{
               b[j++] = a[i];	
		     }
		}//for loop
		for(int i=0;i<b.length;i++)
		{  
			 System.out.print(b[i]);
		}*/
		
		for(int i=0; i<a.length; i++) 
		 {
	         if (i!=0&&i!=a.length-1)
	         {
	          System.out.print(a[i]);	 
         	  }//if 
	      }//for
	}//method
	public static void main(String[] args) {
		Bala boo=new Bala();
		try {
		boo.ba();
		}
		catch(Exception e) {
		System.out.println(e);	
		}
		}
}//main method	
//class