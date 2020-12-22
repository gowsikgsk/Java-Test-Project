package com.array;
public class B_A_ProperSubset {
	public static void main(String[] args) {
		int b[] = { 1, 2, 3, 0 };
		int a[] = { 4, 9, 1, 2, 5, 3, 9,0 };
		int counter = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					counter = counter + 1;
		//	System.out.println(" " + b[i] + " ");
					break;
				} // if
			} // inner for
		} // outer for
		if (counter == b.length) {
			System.out.println("B is Subset of A");
		} else {
			System.out.print("B is not Subset of A");
		}
	}
}
