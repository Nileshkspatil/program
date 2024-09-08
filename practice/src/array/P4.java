package array;

import java.util.Arrays;

public class P4 {
	
	public static int[] sort(int [] a) {
		
		for (int i = 0; i < a.length; i++) {
		
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.println(Arrays.toString(a));
		}
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= { 70,34,9,56,21,9,45,6};
		sort(a);
	//	System.out.println(Arrays.toString(a));
		

	}

}
