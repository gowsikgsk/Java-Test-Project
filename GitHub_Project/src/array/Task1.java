package array;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task1 {

	public static void main(String[] args) throws IOException {

		String inputHTMLTags = new String(Files.readAllBytes(Paths.get("/home/karupu/Downloads/htmlFile.txt")));

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
		}
	}
public static void findchildUsingLineNumber(String inputHTMLTags, int lineNumber)
	{
System.out.println(lineNumber);
TreeSet<String> tree = new TreeSet<String>();
ArrayList<String> child = new ArrayList<String>();
char cr[]=inputHTMLTags.toCharArray(); //convert inputHTML file String to char Array
int counter=0;
int j=0;
 String temp=""; // Temporary String for String Array Creation
 for (int i=0;i<cr.length;i++)
 {
  if (cr[i]=='<')
	{
	counter=counter+1; //To count < for String Array length
    }//if
 }// for cr.length

String G[]=new String[counter];   //Creation of Array

for (int i=0;i<cr.length;i++)
{
//	---------To filter char & Number--------//
 if(cr[i]>=65&&cr[i]<=90||(cr[i]>=48&&cr[i]<=57)||(cr[i]>=97&&cr[i]<=122))
   {
	temp=temp+cr[i];
	// System.out.println(temp+" "+temp.length()+" "+i);
   }//if
 else if(cr[i]=='>')
	{
	 G[j] = temp ;
	 j++; // increase the iteration for String Array
	 temp =""; // To empty temp String for next usage
	 }//else
 }//for

int line=lineNumber-1; //if we enter 1 index 1 will be excuted but we need 0th index value .
//--------2nd line-------//
if(G[line]==G[1])
 {
  for (int y=lineNumber;y<G[y].length();y++)
   {
    int ss=G[y].length();
    if (ss==6&&(G[y].startsWith("c")))
      {
      tree.add(G[y]);   //added into treeset to eliminate duplicates
      }//if ss
   }//for y
 }//if 2 line
 //--------1st line-------//
 else if(G[line]==G[0])
 {
  String temper=G[0]; //store Zeroth index String Array Element into temporary String for comparing String Array Elements
  for (int a=lineNumber;a<G.length;a++)
   {
    if (G[a].equals(temper))
      {
        //System.out.println(G[a]+" test"+a);  // to eliminate parent1
      }
      else if (G[a].length()==7&&(G[a].startsWith("p")))
        {
       tree.add(G[a]);
        }
   }//for
}//else
	//--------8th line-------//
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
 child.addAll(tree); //convert treeset to Arraylist
 System.out.println("Output: "+child);
	}

public static void findchildUsingTagName(String inputHTMLTags, String tagName) {
TreeSet<String> tree =new TreeSet<String>();
ArrayList<String> child = new ArrayList<String>();
char cr[]=inputHTMLTags.toCharArray(); //convert inputHTML file String to char Array
 int counter=0;
int r=0;
String temp=""; // Temporary String for String Array Creation
for (int i=0;i<cr.length;i++)
 {
if (cr[i]=='<')
    {
counter=counter+1; //To count < for String Array length
    }//if
 }// for
String G[]=new String[counter];   //Creation of Array
for (int i=0;i<cr.length;i++)
 {
  //	---------To filter char & Number--------//
  if(cr[i]>=65&&cr[i]<=90||(cr[i]>=48&&cr[i]<=57)||(cr[i]>=97&&cr[i]<=122))
    {
	 temp=temp+cr[i];
	 // System.out.println(temp+" "+temp.length()+" "+i);
    }//if
     else if(cr[i]=='>')
	  {
	   G[r] = temp ;
       r++; // increase the iteration for String Array
	   temp =""; // To empty temp String for next usage
	   }//else
 }//for
String trs=tagName;
int ax=0;
 inn: for(int z=0;z<G.length;z++)
  {
   if (G[z].contentEquals(trs))
	{
	 ax=z;// to find the 1st index of given input
	 break inn;
	 }
  }
  System.out.println(ax);
  /*-------parent2-----*/
 if(ax==1) // parent 2 indexed in 1
{
 for (int s=ax+1;s<G.length;s++)
  {
    int ss=G[s].length();
 	if (ss==6&&(G[s].startsWith("c"))) //to check element length =6
      {
        tree.add(G[s]);	// added to TreeSet to eliminate duplicates
      }//if
   }//inner for
} // if (ax==1)
 /*-------parent3-----*/
 if(ax==7)
 {
  for (int s=ax+1;s<G.length;s++)
 {
    int ss=G[s].length();
  	if (ss==7&&(G[s].startsWith("c")))
      {
     	 tree.add(G[s]);
      }//if
 }//inner for
} //ax==7
 /*-------child33-----*/
 if(ax==10)
 {
  for (int s=ax+1;s<G.length;s++)
  {
     	int ss=G[s].length();
  	if (ss==12&&(G[s].startsWith("g")))
      {
     	 tree.add(G[s]);
     	 //System.out.println(G[s]+" "+s+"  ");
      }//if
   }//inner for
 } //ax==12

 child.addAll(tree);
		System.out.println("Output: "+child);
	}// TagName

}