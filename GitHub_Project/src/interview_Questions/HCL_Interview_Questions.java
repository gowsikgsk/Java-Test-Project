package interview_Questions;

public class HCL_Interview_Questions {

	public static void main(String[] args) {
		int ar[]= {1,3,3,7};
		int temp=0;
		int output=0;
		for(int i=0;i<ar.length-1;i++)
		{
			temp=Math.abs(ar[i]-ar[i+1]);
			output=Math.abs(temp-output);
		//	System.out.println(temp+"   "+output+"  "+i);
		}
		System.out.println(" output= "+output);
	}//main method 
}//class
