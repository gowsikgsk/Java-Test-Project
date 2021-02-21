package interview_Questions;
public class Possiblitys_Array {
	public static void main(String[] args) {
		//int pos[]= {5,8,4,1,4,1,3,2,10};
		int pos[]= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int sum=0;
		String out="";
		int count=0;
		for(int i=0;i<pos.length;i++) 
		  {
			for(int j=i+1;j<pos.length;j++) 
			  {
				if(count==0)
				{
				sum=pos[i]+pos[j];
				count=count+1;
				}
//				else
//				{
//					sum=sum+pos[j];
//				}
//				System.out.print(sum+" "+pos[i]+" "+pos[j]+"   ");
				//System.out.println(sum);
				
				if(sum==15)
				{
					System.out.print(sum+" "+i+" "+j+"   ");
					//System.out.print(i+" f "+j);
					//System.out.print(pos[i]+" find "+pos[j]);
					//out=out+pos[i]+" "+pos[j]+" ";
					out=out+i+" "+j+" ";
					//out=out.concat("\n");
					sum=sum-pos[j];
				}
				else  if(sum>15)
				{
					//System.out.print(i+"  "+j);
					sum=sum-pos[j];
				}
				if(sum<15)
				{
//					System.out.print(sum+" "+pos[i]+" "+pos[j]+"   ");
					sum=sum+pos[j];
				}
			  }
			count=0;
			System.out.println();
			System.out.println(out);
			break;
		//	
		 } 
         
	}

}
