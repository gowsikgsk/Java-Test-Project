package interview_Questions;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.util.ArrayList;
	public class File_remove_largecode {
		int count=0;//to find word count in given file 
		String output="";
		    int counter(char ip[]) {
	    	    String temp="";
	    	    int d=0;
	    	    for(int i=0;i<ip.length;i++)
	    	       {
	    	        if(ip[i]<33||ip[i]>127)
	    	           {
	    	        	if(temp.contentEquals(""))
	    	        	   {
	    	        		//System.out.println("space");
	    	        	   }
	    	        	 else{
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
	    	    else {count=count+1;}
	    	    
	    	    System.out.println(count+" word count in given file");
				return count;
		       }
		    
	   void words (char[] ip)throws Exception{
	    	    String temp="";
	    	    int d=0;
	    	    String sar[]=new String[count];
	    	    for(int i=0;i<ip.length;i++)
	    	       {
	    	        if(ip[i]<33||ip[i]>127)
	    	           {
	    	        	if(temp.contentEquals("")){
	    	        		//System.out.println("space");
	    	        	}
	    	        	else {
	    	                   sar[d++]=temp;
	    	        		    temp="";
	    	        	     }
	    	           }// if ip[i]<33||ip[i]>127
	    	       else{
	    	        	temp=temp+ip[i];
	    	           }
	    	       }//for loop
//	    	    if(temp.contentEquals("")){ }
//	    	    else {sar[d]=temp;}
	    	 
	    	    
	    	    for(int i=0;i<sar.length;i++)
	    	    {
	    	    	output=output+sar[i]+" ";
	    	    }   
	    	    System.out.println(output+" "+output.length());
	           }
	     
		public static void main(String[] args) throws Exception{
	  String txt=new String(Files.readAllBytes(Paths.get("C:\\Users\\Karupu\\Desktop\\Space.txt")));
	  char ip[]=txt.toCharArray();
	  File_remove_largecode files=new File_remove_largecode();
	  files.counter(ip);
	  files.words(ip);
	  
	  try 
	  {
		FileWriter Fw= new FileWriter("C:\\Users\\Karupu\\Desktop\\Space.txt");
		Fw.write(files.output);
		Fw.flush();
		Fw.close();
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
		}

	}

	
	
	
