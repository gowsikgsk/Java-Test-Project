package array;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Task1 {
	public static void main(String[] args) throws IOException {
		String inputHTMLTags = new String(Files.readAllBytes(Paths.get("/home/karupu/Downloads/htmlFile.txt")));
        //  System.out.println(inputHTMLTags);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to enter the line number or 2 to enter the tag name:");
		int userInput1 = sc.nextInt();

		switch(userInput1) {
			case 1:
				System.out.println("Enter the line number:");
				int lineNumber = sc.nextInt();
				findchildUsingLineNumber(inputHTMLTags, lineNumber);

				break;
			case 2:
				System.out.println("Enter the tag name:");
				sc.nextLine();
				String tagName = sc.nextLine();
				findchildUsingTagName(inputHTMLTags, tagName);
				break;
			default:
					System.out.println("Invalid Option at Switch");
		}//switch
		}

	public static void findchildUsingLineNumber(String inputHTMLTags, int lineNumber)
	{
	      System.out.println(lineNumber);
	      TreeSet<String> tree = new TreeSet();
		ArrayList<String> child = new ArrayList<String>();
	       char cr[]=inputHTMLTags.toCharArray();
	       int counter=0;
	       int j=0;
	       String temp="";
	       for (int i=0;i<cr.length;i++)
		    {
			if (cr[i]=='<')
			    {
				counter=counter+1;
			    }//if
		    }// for

String G[]=new String[counter];
for (int i=0;i<cr.length;i++)
{
 if(cr[i]>=65&&cr[i]<=90||(cr[i]>=48&&cr[i]<=57)||(cr[i]>=97&&cr[i]<=122))
   {
	temp=temp+cr[i];
	// System.out.println(temp+" "+temp.length()+" "+i);
  }//if
 else if(cr[i]=='>')
	{
	 G[j] = temp ;
	 j++;
	 temp ="";
	 }//else
 }//for

int line=lineNumber-1;
/*--------2nd line-------*/
if(G[line]==G[1])
  {
 for (int y=lineNumber;y<G[y].length();y++)
{
  int ss=G[y].length();
  if (ss==6&&(G[y].startsWith("c")))
  {
   tree.add(G[y]);
//  System.out.println(tree);
   }//if ss
 }//for y
 }//if 2 line

 /*--------1st line-------*/
  else if(G[line]==G[0])
	 {
String temper=G[0];
for (int a=lineNumber;a<G.length;a++)
{
 if (G[a].equals(temper))
{
//   System.out.println(G[a]+" test"+a);
 }
 else if (G[a].length()==7&&(G[a].startsWith("p"))&&G[a]!=temper)
 {
tree.add(G[a]);
}
 }//for
}//else
	/*--------8th line-------*/
if(G[line]==G[7])     
   {
for (int a=lineNumber;a<G.length;a++)
  {
 if (G[a].length()==7&&(G[a].startsWith("c")))
 {
	tree.add(G[a]);
	}//if
  }//for
 }//8th
 child.addAll(tree);
 System.out.println("Output: "+child);
	}
	public static void findchildUsingTagName(String inputHTMLTags, String tagName) {

		ArrayList<String> child = new ArrayList<String>();

		
		System.out.println("Output: "+child);
	}

}
/*
for (int i=0;i<cr.length;i++)
{
	 if(cr[i]==47||cr[i]==32||cr[i]==60||cr[i]==62)
	// if(cr[i]!='<'&&cr[i]!='/'&&cr[i]!='>'&&cr[i]!=32)
	 {
counter1=counter1+1;
// System.out.println(counter1+" "+cr[i]);
	 }//if
}//for */

//if(cr[i]!='<'&&cr[i]!='/'&&cr[i]!='>'&&cr[i]!=' '){



/* for (int i=0;i<cr.length;i++)
{
//   System.out.println(cr[i]+" "+i);
}*/


/*
	       for (int s=0;s<G.length;s++)
		    {
	    	// System.out.print(G[s]+" "+G[s].length());
		    }


	   // child.add(lineNumber, inputHTMLTags);   //.(inputHTMLTags)  */


/*   //for (int y=lineNumber;y<G[a].length();y++)
	    	     // {
	    		//   System.out.println(G[a]+ " "+a);
	    		   //tree.add(G[a]);
	    	 // System.out.print(y+" "+G[y]+"  ");
	    	    //}//for
	    	   // G[1]*/
/*
for (int s=0;s<G.length;s++)
{
// System.out.println(G[s]+" "+G[s].length());
}*/
/* int num=1;
switch(num) {
case 1:*/     //   break; case 2://

