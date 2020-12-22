package immutableString;
public class Bala {
	void ba()
	{
		String s=new String(" Bala ");
		char a[]=s.toCharArray();
		char b[]=new char[a.length];
		
	     for(int i=0;i<a.length;i++) 
	     {
			if (a[i] !=32);
			{
               b[i] = a[i];	
		     }
		}//for loop
		for(int i=0;i<b.length;i++)
		{  
			 System.out.print(b[i]);
		}
	}//method
	public static void main(String[] args) {
		Bala boo=new Bala();
		boo.ba();
}//main method	
}//class