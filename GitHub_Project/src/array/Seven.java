package array;
public class Seven {
	public static void main(String[] args) {
	String S = "India is my country and all indians are my brothers and sisters and i love my country very much";
		char cr[] = S.toCharArray();
		for (int i = 0; i < cr.length; i++) {
			//if(cr[i] % 7 == 0 )
				System.out.print((int)cr[i]+"  "+cr[i]+" ");
		}
	}
}
