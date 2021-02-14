package interview_Questions;
public class tezts {
	public static void main(String[] args) {
		int som=19;
		System.out.println(som+"= Sum of Digits"+som%10);
		int nm=0;
		int sm=0;
		while(som>0)
		{
			nm=som%10;
			som=som/10;
			sm=sm+nm;
			System.out.println(sm+" = sm ; num = "+nm+" som ="+som);
		}
		
		System.out.println(sm+"= final output");

	}

}
