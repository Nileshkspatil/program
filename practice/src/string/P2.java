package string;

import java.util.Arrays;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to jspider";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			 rev=rev+s.charAt(i);
			
		}
		
		String [] a=rev.split(" ");
		
		for (int i = a.length-1; i>=0; i--) {
			
			System.out.print(a[i]+" ");
		}

	}

}
