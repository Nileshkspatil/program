package com.simple;

public class P4 {

	public static void isPalindrome(int n) {
		int rev=0, temp=n;
		
		while(n!=0) {
			
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println(temp+": is palindrome");
		}else {
			System.out.println(temp+": not palindrome");
		}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(123212);
		isPalindrome(121);

	}

}
