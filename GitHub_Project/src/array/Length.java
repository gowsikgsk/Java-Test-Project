package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Length {
	void FindLength() {
		String SS="";
		 String empty="";
		 ArrayList<String> ar=new ArrayList<String>();
		 String D[]= {"gowsik","g","f","life",""};
		 ar.addAll(Arrays.asList(D));
		 for(int k=0;k<ar.size();k++) 
	        { 
		      System.out.println(D[k]+" = "+D[k].lastIndexOf(empty)+" ");
		  //  SS=ar.get(k).toString();
	        }
	}// FindLength()
 public static void main(String[] args) {
	 Length len=new Length();
	 len.FindLength();
   }// main method
 }// class


//System.out.println(ar.get(k));
/* Iterator<String> i=ar.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}*/


/*for(String w: ar) 
{
	 System.out.println(w);
}*/

/* for(int j=0;j<D.length;j++) 
{ 
//	ar.add(D[j]); 
//System.out.println(D[j]);
}*/


	/*	String E[]=D;	
		String G="";
		
	 int count=0;
	 int tr=1;
	 int r=0;
	 for(int y=0;y<tr;y++)
	    {
		// System.out.println(y+" "+r);
		 if((y-1)==r&&y!=0){
			 System.out.println("final");
			// System.out.println(y+" "+r);
			// break;
		 }
		 if(D[y].contentEquals("`")){
			System.out.println("gshhd"); 
		 }
		 else {
			tr=tr+1;
			count=count+1;
			r=count;
			System.out.println(y+" "+r);
		//	System.out.println(count); 
		 }
		 
	    }	 	
		//nee.ff();*/
	
 
/*for(int y=0;true;y++)
	    {
		 if(D[y]!="") {
			 D[y]=D[y]+" ";
			count=count+1;
		 }
		 if(D[y].equals(G)) {
			 break;
		 }
		 
	  }//FOR
	 System.out.println(count);*/

	 
	/* for(int j=0;true;j++)
	    {
		 for(int k=0;true;k++)
		    {
            if(D[j].contentEquals(E[k]))
            {
            	count=count+1;
            	System.out.println(D[j]+" "+count);
            }
            else {
            	break;
            	
            }
		    }
	    }*/
   
 
 
 
 
	/* for(int i=0;true;i++)
	    {
		 System.out.println(D[i].lastIndexOf(G));
		 String Y= D.toString();
	    }*/
 
//SS=SS+Y+" ";
	//	 System.out.println(SS);
	 /*  char cr[]=D[i].toCharArray();
		 System.out.println(D[i].lastIndexOf(G));
		 if(D[i+1].equals(null)) {
			 System.out.println("fail");
			 break; 
		 }
		 
		 if(D[i].isEmpty()) {
			 System.out.println("fil");
			 break;
		 }
		 else {
			 System.out.println("pass");
		 } */
	 
		// if(D[i].isEmpty()) 
		// if(D[i].lastIndexOf(G)) 
	 /*{
		 System.out.println("hjf");
		 break;
	  }
	 else 
	 {
		 con=con+1;
		 System.out.println(con+" "+i);
	 }
		}
	  * 
		}
	  * 
	  * for(int i=0;true;i++)
		{
		 G=D[i].toString();
		  if(G.equals(""))
		  {
			  System.out.println("break");
			break;  
		  }
		  else
		  {
			  con=con+1;
			  G="";
		  }
		  if(D[i+1].equals(null))
		  {
			  break;
		  }
		  
		  System.out.println(con+" ");
	  } // while loop */
	//} 
 
 /* --------To-Find-Length-of-Indudial-String-Array-------*/
 /*  void ff() {
		 for(int i=0;i<con;i++)
			{
			   String S=D[i].toString();
			   char cr[]=S.toCharArray();
			   for(int u=0;true;u++)
				{
				   try {
				 if(cr[u]!='\0')
				    {
					 count=count+1;  
				    } 
				   }
				   catch(Exception e)   {
					   System.out.print(S+" = "+count+" ");
					   count=0;
					   break ;
				   }
				}
			}
	 }*/

	
