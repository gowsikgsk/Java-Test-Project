package interview_Questions;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Space_FileIO {
	String space(String txt) throws Exception{
		String ar[] = txt.split("\n");
		String output = ""; String temp ="";
		for (int i = 0; i < ar.length; i++) {
			if(!ar[i].isBlank()) { 
			     for(char x:ar[i].toCharArray()) {
			    	 if(x==' ') {
			    		 if(temp!="") {
			    	     output = output + temp+" ";
			    		 temp="";
			    		  }
			    	  }
			    	 else {
			    		temp=temp+x; 
			    	  }
			     }
			     output = output+temp.concat("\n");
				 temp="";
			}//if !ar[i].isBlank()
		}//for
		System.out.println(output);
		return output;
	}
	public static void main(String[] args) throws Exception {
		String txt = new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\ace.txt")));
		Space_FileIO file = new Space_FileIO();
		String out = file.space(txt);
//		try {
//			FileWriter fw = new FileWriter("C:\\Users\\Karupu\\Desktop\\ace.txt");
//			fw.write(out);
//			fw.flush();
//			fw.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
	}

}
//if (!ar[i].equals("")&&!ar[i].isBlank()&&!ar[i].equals(" ")) {
//output = output+temp;
//output = output.concat("\n");
//temp="";
//if(!ar[i].equals("")) {
//System.out.println(ar[i]+"  "+i);}
//if(!ar[i].isBlank()&&!ar[i].isEmpty()) 