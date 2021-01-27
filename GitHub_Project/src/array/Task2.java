package array;
public class Task2 {
	public static void main(String[] args) {
		String S="India is My Country";
		char d[]=S.toCharArray();
		 int n=0;
		for (int i=0;i<d.length;i++)
		{
			n = (char) (d[i]%3);
			if (n==0)
			{
				System.out.println(d[i]+" ");
				
			}
		}
         
	}

}
