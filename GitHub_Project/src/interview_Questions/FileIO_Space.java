package interview_Questions;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class FileIO_Space {
	int count=0;//to find word count in given file 
	String output="";
	ArrayList<String> al= new ArrayList<String>();
	    int counter(char ip[]) {
    	    String temp="";
    	    for(int i=0;i<ip.length;i++)
    	       {
    	        if(ip[i]<33||ip[i]>127)
    	           {
    	        	if(!temp.contentEquals(""))
    	        	   {al.add(temp+" ");
	        		    count=count+1;
	        		    temp="";
    	        	   }
    	           }//if 
    	        else
    	           {
    	        	temp=temp+ip[i];
    	           }
    	       } // for loop
    	    if(temp.contentEquals("")){ }
    	    else {al.add(temp);
    	    	count=count+1;}
    	    
    	    System.out.println(count+" word count in given file");
    	    for(int i=0;i<al.size();i++)
    	      {
                String tp=al.get(i);  
                output=output+tp;
    	      }
    	    System.out.println(output);
			return count;
	       }
	public static void main(String[] args) throws Exception{
  String txt=new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\ace.txt")));
  char ip[]=txt.toCharArray();
  FileIO_Space file=new FileIO_Space();
  file.counter(ip);
  try 
  {
	FileWriter Fw= new FileWriter("C:\\Users\\Karupu\\Desktop\\ace.txt");
	Fw.write(file.output);
	Fw.flush();
	Fw.close();
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
	}
}
