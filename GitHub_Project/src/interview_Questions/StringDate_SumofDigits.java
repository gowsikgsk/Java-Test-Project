/* To Sum the all Digits in given Date output will be the Single Digits
 * Ex: 12/12/2021  ((1+2)+(1+2)+(2+0+2+1))sum of digits is 11 in given date
 *  finally need single digit output 11 sum of 1+1 =2  */
package interview_Questions;
import java.io.FileNotFoundException;
public class StringDate_SumofDigits {
	Void StrDate() throws FileNotFoundException {
		String S="12/12/2021";
		String temp="";
		for (int i=0;i<S.length();i++) 
		{
			if(S.charAt(i)!='/') // to eliminate the / special charater
			{
				char cr=S.charAt(i); 
				temp=temp+cr;		
			}
		} 
		int r=Integer.parseInt(temp);  // to convert String into Integer
		System.out.println(r);
		int num=0;
		int som=0;
		while(r>=1)
		{
			num=r%10;
			r=r/10;
			som=som+num;
			//System.out.println(r+" = r ; num = "+num+" som ="+som);
		}
		if(som<10)
		{
			System.out.println(som+" = Sum of Digits");
		}
		else 
		{
			System.out.println(som+"= Sum of Digits"+som%10);
			int nm=0;
			int sm=0;
			while(som>0)
			{
				nm=som%10;
				som=som/10;
				sm=sm+nm;
				//System.out.println(sm+" = sm ; num = "+nm+" som ="+som);
			}	
			System.out.println(sm+"= final output");
		}
		return null;
	}
	public static void main(String[] args) throws FileNotFoundException {
		StringDate_SumofDigits inter =new StringDate_SumofDigits();
		inter.StrDate();
	}
}
//ar[j++]=(int)S.charAt(i);
//temp=S.charAt(i);
//sum=temp+sum;
//System.out.println(temp+" "+sum+" "+i+"   ");
//System.out.print(ar[j]+" "+S.charAt(i)+"   ");