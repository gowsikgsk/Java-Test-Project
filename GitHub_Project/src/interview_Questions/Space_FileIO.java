package interview_Questions;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Space_FileIO {
	String space(String txt) throws Exception{
		String ar[] = txt.split("\n"); String output = ""; String temp ="";
		for (int i = 0; i < ar.length; i++) {
			if(!ar[i].isBlank()) 
			{  // To Eliminate the empty String Array Elements
			     for(char x:ar[i].toCharArray()) 
			     { //in order to remove space to convert  String to char array
			    	 if(x==' ') // tofind given String is empty
			    	  {
			    		 if(temp!="")
			    		   {
			    	       output = output + temp+" ";
			    		   temp="";
			    		   }
			    	  }
			    	 else {
			    		temp=temp+x; 
			    	  }
			     }//inner for loop
			     output = output+temp.concat("\n");
				 temp="";
			}//if !ar[i].isBlank()
			return output;
		}//outer for
		System.out.println(output);
		return output;
	}
	public static void main(String[] args) throws Exception {
		String txt = new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\ace.txt")));
		Space_FileIO file = new Space_FileIO();
		String output_1 = file.space(txt);
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Karupu\\Desktop\\ace.txt");
			fw.write(output_1);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
//if (!ar[i].equals("")&&!ar[i].isBlank()&&!ar[i].equals(" ")) {
//output = output+temp;
//output = output.concat("\n");
//temp="";
//if(!ar[i].equals("")) {
//System.out.println(ar[i]+"  "+i);}
//if(!ar[i].isBlank()&&!ar[i].isEmpty()) 