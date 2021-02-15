/*a) Read  afile which contains the details of the students in a class.
 Each line in the file is of the format reg no,student name,Age,Gender,Address
Example: 
A001,Sam,11,Ashok Nagar
A002,Tim,13,Tambaram
A001,Sam,11,Ashok Nagar
A002,Tim,13,Tambaram
*
b) All the data from the file has to be loaded into one Suitable data
 Structure in java to remove duplicates
*
c) Write a method that will take the reg no as input and prints 
all the details of the students that  matched the registration number.
Hint: Use the correct data structure in step
 b)which can make method very simple and efficient
* */

package interview_Questions;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class FileIO_removeDuplicates_dataSturctue {
void file1(String txt, LinkedHashSet<String> lhs)
 {
	 String ar[] = txt.split("\n");
	 System.out.println("Before Remove  Duplicate");
	  for (String s : ar)
	      {
	    s = s.trim(); 
	    lhs.add(s); // to eliminate duplicates 
	    System.out.println(s);
	      }
	 		System.out.println("After Removed Duplicate");
	 		System.out.println(lhs);
	 		System.out.println(" Enter Studnt ID");
	 		Scanner sc = new Scanner(System.in);
	 		String input = sc.nextLine();

	 		Iterator<String> itr = lhs.iterator();
	 		while (itr.hasNext()) 
	 		  {
	 			String k = itr.next();
	 			if (k.contains(input))
	 			   {
	 				System.out.println(k);
	 			   }
	 	      }// while 	            	
 }
	public static void main(String[] args) throws IOException 
	{
	FileIO_removeDuplicates_dataSturctue inter= new FileIO_removeDuplicates_dataSturctue();
LinkedHashSet<String> lhs = new LinkedHashSet<String>();
/* to store  all .txt file contents into the String txt  */
String txt = new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\MVI2.txt")));
inter.file1(txt,lhs); 
	}//main method
}
