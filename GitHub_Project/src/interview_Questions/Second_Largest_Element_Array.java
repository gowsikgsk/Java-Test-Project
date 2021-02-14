package interview_Questions;
public class Second_Largest_Element_Array {
	public static void main(String[] args) {
		int a[]={6,8,9,1,11,13,90,1,34};
		int max=a[0]; int smax=a[0];
		for (int i=0;i<a.length;i++){
			if (max<a[i]){
				max=a[i]; // to find largest element in int array
			}
		}	
		for (int i=0;i<a.length;i++){
			if(max>a[i]&&smax<a[i]) {
				smax=a[i]; // to find Second Largest element in int array
			}
		}
		System.out.println(max +"Largest elemet in int array");
		System.out.println(smax+"Second Largest element in int array");
	}
}

