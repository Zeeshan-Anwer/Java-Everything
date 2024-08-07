package Array.basic.zeeshan;


import java.util.Arrays;

public class Reverse{

	public static void main(String[] args) {
		
		int a[]= {10,-10,5,7,-9,3};
		System.out.println(Arrays.toString(getSortedPositive(a)));
	}
	
	public static int[] getSortedPositive(int[] a) {
		
		int i=0,j=0;
		while(i<a.length-1) {
			
			if(a[i]>=0) {
				a[j]=a[i];
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(a));
		for(i=1,j=0;i<a.length-1;i++,j++) {
			if(a[i]<a[j])
				a[j]=a[i];
		}
		System.out.println(Arrays.toString(a));
		return a;
	}
}

// not wrokign fine programmer


