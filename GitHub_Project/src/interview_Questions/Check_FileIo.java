package interview_Questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Check_FileIo {
	       String S="";
	       String check(String txt) {
	       String G[]=txt.split("\n");
	        	  for(int i=0;i<G.length;i++) 
	        	    {
	        		if(!G[i].isBlank()) 
	        		{
	        			String temp=G[i];
	        	    if(!temp.contentEquals(" ")) {
	        			temp=temp.trim();
	        			S=S+temp.concat("\n");//new line
	        	    }
	        		}
	        	    }
	        	  
	        	  return S;
	          }
	

	public static void main(String[] args) throws IOException {
		String txt = new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\the.txt")));
	      Check_FileIo file=new Check_FileIo();
	     String output=file.check(txt);
	     System.out.println(output);
	}

}
