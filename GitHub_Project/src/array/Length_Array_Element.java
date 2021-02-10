package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Length_Array_Element {
	void FindLength() {
		String SS="";
		 String empty="";
		 ArrayList<String> ar=new ArrayList<String>();
		 String D[]= {"gowsik","g","f","life",""};
		 ar.addAll(Arrays.asList(D));
		 for(int k=0;k<ar.size();k++) 
	        { 
		      System.out.println(D[k]+" = "+D[k].lastIndexOf(empty)+" ");
		  //  SS=ar.get(k).toString();
	        }
	}// FindLength()

	public static void main(String[] args) {
		Length_Array_Element len=new Length_Array_Element();
		 len.FindLength();
	}

}
