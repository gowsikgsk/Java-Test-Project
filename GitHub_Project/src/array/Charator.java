package array;

public class Charator {

	public static void main(String[] args) {
		String s = "";
		int count = 0;
		while (count != 5) {
			char c = (char) (Math.random() * 1000);
			if (c >=48 && c <= 127) {
				s = s + c;
				count = count + 1;
			}
		}
		System.out.println(s);
	}
}