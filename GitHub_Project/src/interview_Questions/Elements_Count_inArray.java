/*how many times element present in given array*/
package interview_Questions;
public class Elements_Count_inArray  {
	void ss() throws Exception{
		int ar[]= {0,0,2,3,3,5,6,6,9,9,4,1};
		int count=0;
		int temp=0;
		int c=0;
		for(int h=0;h<ar.length;h++)
    		{		
 	 	if(ar[h]==0) 
 	 	   {
 	 		c=c+1; // count the 0s in given int array
        	}
	   	}//for
		if(c!=0) {
		System.out.println(0+"=ar[i];count= "+c);
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j]&&ar[i]!=0) 
				{
					ar[j]=0;
					count=count+1;
					temp=count;
			//	System.out.println(ar[i]+"element "+count+" ");
				}
			}// inner for
			 if(ar[i]!=0)
			{
				System.out.print(ar[i]+" =ar[i];count= "+(temp+1)+"  ");
				temp=0;
			}
			count=0;
		}
	}
	public static void main(String[] args) throws Exception {
		Elements_Count_inArray ss=new Elements_Count_inArray();
		ss.ss();
		/**/
	}
	}

















