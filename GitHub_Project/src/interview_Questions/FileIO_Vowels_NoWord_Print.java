/* Interview Questions (MVI)
 * a) Read afile as input and print the total count of word that start 
 * with a vowel in the file.you can Assume that each word 
 *is Separated by a space character in the file.
 * 
 *b)Print all the Words that start with a number in the file.  */
package interview_Questions;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
public class FileIO_Vowels_NoWord_Print {
 static void test() throws IOException {
   int count=0;
   String txt = new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\abc.txt")));
   String Sar[]=txt.split(" ");
	for(int i=0;i<Sar.length;i++) // to print words that start with numbers
	  {
  if(Sar[i].startsWith("0")||Sar[i].startsWith("1")||Sar[i].startsWith("2")||
  Sar[i].startsWith("3")||Sar[i].startsWith("4")||Sar[i].startsWith("5")||Sar[i].startsWith("6")||
  Sar[i].startsWith("7")||Sar[i].startsWith("8")||Sar[i].startsWith("9"))
		{
		count=count+1;
		System.out.println(Sar[i]);
		}
	  }// for vowels
System.out.println(count+" Total Number Word Count");	
int co=0;
for(int j=0;j<Sar.length;j++) // to print words that start with Vowels
{
if(Sar[j].startsWith("a")||Sar[j].startsWith("e")||Sar[j].startsWith("i")||
Sar[j].startsWith("o")||Sar[j].startsWith("u"))
	{
	co=co+1;
	System.out.println(Sar[j]);
	}
	  }//for
System.out.println(co+" Total Vowels Word Count");
	 
	}// test method
		public static void main(String[] args) throws IOException {
		test();
	}
}
/*  // work-out codes	
 * tre();
 *  static void tre() throws IOException
	{
		TreeSet<String> tr= new TreeSet<String>();
		String s = new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\abc.txt")));
		//System.out.println(s);
	//	s=s.trim();
		
		String Str[]=s.split(" ");
		tr.addAll(Arrays.asList(Str));
		Iterator<String>  itr=tr.iterator();
		for(int i=0;itr.hasNext();i++) 
		  {
			Object ele= itr.next();
			//String d=(String) ele;
			//System.out.print(" "+d);
		  }//for loop	
		
		// to find word start with vowels
		int temps=tr.size();
		for(int i=0;i<tr.size();i++) 
		  {
			Object ele= itr.next();
			
			//String d=(String) ele;
			//System.out.print(" "+d);
		  }
		char cr[]=s.toCharArray();
		System.out.println(tr.size()+" Size ofword ");
		int vowels=0;
		int word=0;
		for(int i=0;i<cr.length;i++) {
		if(cr[i]=='a'||cr[i]=='e'||cr[i]=='o'||cr[i]=='u')
		  {
			vowels=vowels+1;
		   }
		if(cr[i]==' ')
		{
		
			word=word+1;
		}
		}
		//System.out.println(word);
		//System.out.println(vowels);	
	}
*/

