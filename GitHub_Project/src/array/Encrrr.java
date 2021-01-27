package array;
public class Encrrr {
	public static void main(String[] args) {
  String S="India is my country";
  char a[]=S.toCharArray();
  int c=40;
  for(int i=0;i<a.length;i++)
  {
	a[i]=(char)(a[i]+c);  
	c=c+4;
  }
  for(int i=0;i<a.length;i++)
  {
	System.out.print(a[i]+" ");  
  }
  //decrptionsss
  c=40;
  System.out.println(); 
  for(int i=0;i<a.length;i++)
  {
	a[i]=(char)(a[i]-c);  
	
	c=c+4;
  }
  for(int i=0;i<a.length;i++)
  {
	System.out.print(a[i]+" ");  
  } 
  }
	}


