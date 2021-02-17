package interview_Questions;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Space_FileIO {
	         String space(String txt) 
	           {
	        	 String ar[]=txt.split(" ");
	        	 String output="";
	        	 for (int i=0;i<ar.length;i++)
	        	 {   
	        		 if(!ar[i].equals("")&&!ar[i].isBlank())
	        	 	{
	        	 		String temp=ar[i];
	        	 		temp=temp.trim();
	        	 		output=output+temp+" ";
	        	 	}
	        	 }
	        	 System.out.println(output);
	        	 return output;
	         }

	public static void main(String[] args) throws IOException {
		String txt=new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\ace.txt")));
		Space_FileIO file=new Space_FileIO();
        String out=file.space(txt);
        try {
        	FileWriter fw= new FileWriter("C:\\Users\\Karupu\\Desktop\\ace.txt");
        	fw.write(out);
        	fw.flush();
        	fw.close();
        }
        catch(Exception e)
        {
        System.out.println(e);	
        }

	}

}
//if(!ar[i].equals("")) {
//System.out.println(ar[i]+"  "+i);}
//if(!ar[i].isBlank()&&!ar[i].isEmpty()) 