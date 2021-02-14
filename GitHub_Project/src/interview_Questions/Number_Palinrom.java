/* To find given number is palinrom */
package interview_Questions;
public class Number_Palinrom {
	public static void main(String[] args) {
		int i=80808;
		int input=i;
		String sum="";
		int modu=0;
		while(i>0) 
		  {
		modu=i%10;
		i=i/10;
		sum=sum+modu;
	      }
		int reverse=Integer.parseInt(sum);
		if(reverse==input) {
		System.out.println(input+" is palinrom");
		}
		else
		{
			System.out.println(input+" is not a palinrom");	
		}
		
	}

}
