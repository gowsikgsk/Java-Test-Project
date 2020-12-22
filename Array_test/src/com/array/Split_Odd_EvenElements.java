package com.array;
public class Split_Odd_EvenElements {
	public static void main(String[] args) {
		int counter=0;
		int d,e;
	    int i=0,k=0; // iinititazion requied 
		int a[]= {7,6,4,1,9,3,2,1,10};
		for (int j=0;j<a.length;j++){ //find the size of  even ,add array
			if (a[j]%2==0)
 		   {
			 counter=counter+1;
 		   }
		}
        int b[]=new int[counter];// for even array co
		int c[]=new int[a.length-counter]; //for ODD array
       
        for (int j=0;j<a.length;j++){ 
    		if (a[j]%2==0)// for even element array
    		   {
    			d=a[j];
    			b[i]=d;
    			i++;
    			}
              }
        for (int j=0;j<a.length;j++){ 
    		if (a[j]%2!=0)//for odd element array
    		   {
    			e=a[j];
    			c[k]=e;
    			k++;
    			}
              }
        
     //   System.out.println(i);
        for (int f=0;f<b.length;f++){ 
        	System.out.print(" "+b[f]+" ");
    		}
        System.out.println(" ");
        
        for (int x=0;x<c.length;x++){ 
        	System.out.print(" "+c[x]+" ");
    		}
	}
}
