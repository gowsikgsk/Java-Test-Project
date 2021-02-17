package interview_Questions;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
public class Delete {
	public static void main(String[] args) {
		LinkedList<String> lal = new LinkedList<String>(); 
		lal.add("Gowsik");
		lal.add("G");
		lal.add("k");
		lal.add("s");
		System.out.println(lal);
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("a");
		lhs.add("b");
		System.out.println(lhs);
		TreeSet<Object> tree=new TreeSet<Object>();
		tree.add("ff");
		tree.add("gowsik");
		System.out.println(tree);
		
	}

}
