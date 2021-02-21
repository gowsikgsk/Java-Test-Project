package interview_Questions;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileIO_SB {
	         static void news(String txt) 
	             {
	            	 StringBuilder sbu=new StringBuilder(txt);
	            	 for (int i = 0; i < sbu.length(); i++) {
	            		 if(sbu.charAt(i)==32) {
	            			// System.out.println(i);
	            		sbu.deleteCharAt(i);
	            		i--;
	            		 }
	            	 }
	            	 System.out.println(sbu);
	             }
	public static void main(String[] args) throws IOException {
		String txt=new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\ace.txt")));
        news(txt);
		//		StringBuffer sb=new StringBuffer(txt);
//		String temp="";
//		char c[]= {'a','b'};
//	//	for(char i:txt.toCharArray()) {
//		for (int i = 0; i < sb.length(); i++) {
//			if(sb.charAt(i)>32&&sb.charAt(i)<128) 
//			{
//				temp=temp+sb.charAt(i);
//			///	System.out.println(i+" if");
//				//System.out.print(sb.charAt(i)+" "+i+"  ");
//			}
//			else
//			{
//			sb=sb.deleteCharAt(i);	
//			}
////			 if(i<33)
////			{
////				System.out.print(i);
////				sb.del;
////			}
//		   }
//        System.out.println(sb);
//		//System.out.println(temp);
	}

}
