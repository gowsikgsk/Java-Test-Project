package array;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
class A extends Thread {
	public void run() {
		try {
			ArrayList<String> al = new ArrayList<String>();
			String S = ""; // empty string initizilation to store data from file
			String D = ""; // for converting upper case  
			FileReader fr = new FileReader("C:\\Users\\Karupu\\Desktop\\abc.txt");
			int i;
			while ((i = fr.read()) != -1) 
			  {
				S = S + (char) i;
			  }
			D = S.toUpperCase(); // S String converted into Upper case
			String SS[] = D.split(",");
			for (int j = 0; j < SS.length; j++) 
			  {
				al.add(SS[j]); // added into array list
		      }
			Collections.sort(al); //sorted using sort 
			System.out.println(al);
		} //try 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}// class A
class B extends Thread {
	public void run() {
		try {
			LinkedHashSet<Character> unique = new LinkedHashSet<Character>();// using linked hashset to eliminate the duplicates 
			String S = "Java is programming language";
// to find unique charactors 
			char a[] = S.toCharArray(); 
			for (int i = 0; i < a.length; i++) 
			  {
				unique.add(a[i]);
			  }
			String SS = unique.toString();
			String xx="Unique charset are  ";
			FileWriter fr = new FileWriter("C:\\Users\\Karupu\\Desktop\\xyz.txt",true);
			fr.write(xx);
			fr.write(SS);
			fr.write("\n");
			fr.flush();
			fr.close();
			SS = "";
			xx="";
// to find repeating charators
			LinkedHashSet<Character> repeat = new LinkedHashSet<Character>();
			for (int i = 0; i < a.length; i++)
			 {
				int counter = 0;
				for (int j = i + 1; j < a.length; j++) 
				{
					if (a[i] == a[j])
					 {
						counter = counter + 1;
						System.out.print(a[i]+" " );
					 }
				}
				if (counter > 0) {
					repeat.add(a[i]);
				}
			 }
		    SS=repeat.toString();
	        xx="  Repeating charset are  ";
			FileWriter r = new FileWriter("C:\\Users\\Karupu\\Desktop\\xyz.txt", true);
			r.write(xx);
			r.write(SS);
			r.write("\n");
			r.flush();
			r.close();
			SS = "";
			xx=""; 
// to find non repeating charators			
			for (int i = 0; i < a.length; i++) 
			{
				int counter = 0;
				for (int j = i + 1; j < a.length; j++)
				{
					if (a[i] == a[j])
					{
					 counter = counter + 1;
					}//if equal
				} //inner for
				if (counter==0)
				  {
					SS=SS+a[i];
				  }//if counter
			 }//outer for
			System.out.println("non repeated charset is "+SS);
				xx=" Non Repeating charset are  ";
				FileWriter nonrepeat = new FileWriter("C:\\Users\\Karupu\\Desktop\\xyz.txt", true);
				nonrepeat.write(xx);
				nonrepeat.write(SS);
				nonrepeat.flush();
				nonrepeat.close();
				SS = "";
				xx="";
			}		
		 catch (Exception e)
		{
			System.out.println(e);
		}
	}// method run
}//class B
public class Desktop {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	}// main method
}// main class
