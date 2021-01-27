package array;
public class Del_1 {
public static void main(String[] args) {
	Del_1 pbj = new Del_1();
	Del_1 jk = pbj;//new Del_1();
	//System.out.println(pbj.hashCode());
	//System.out.println(jk.hashCode());
	System.out.println(pbj.equals(jk));

	String a="ABC";
	String b="ABC";
	System.out.println(a.equals(b));
/*	if(a.equals(b))
	{
		System.out.println("true");
	}
	else 
	{
		System.out.println("False");
	}
	/*
	for (int i = 0; i < 1; i++) {
		if(i==5) {
			//System.exit(0);
		}
	}
	long	x=40l;
	Integer j=1;
	System.out.println(j.hashCode());
	long cc;
	for (int i = 0; i < 127; i++) {
		
		cc=x*j;
		System.out.println(cc+" "+x+" "+i+"  ");
		j=j+1;
        x=x+9;
	}
	*/
	}
}
