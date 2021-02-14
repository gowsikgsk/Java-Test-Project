/* To Find Length of Array Elements Without Using Length Method in Core Java */
package interview_Questions;
import java.util.ArrayList;
import java.util.Arrays;
public class Length_Array_Element {
	void FindLength() {
	String empty="";
    ArrayList<String> ar=new ArrayList<String>();
	String D[]= {"gowsik","g","f","life",""};
	ar.addAll(Arrays.asList(D)); // to add All String Array Elements into ArrayList
	for(int k=0;k<ar.size();k++) 
      { 
      System.out.print(D[k]+" = "+D[k].lastIndexOf(empty)+" ");
      }
	}// FindLength()
	public static void main(String[] args) {
		Length_Array_Element len=new Length_Array_Element();
		len.FindLength();
	}
}
//String SS="";
//SS=ar.get(k).toString();