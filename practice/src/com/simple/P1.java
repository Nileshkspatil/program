package com.simple;

public class P1 {
	public static void number(int n) {
		if(n<=10) {
			System.out.println(n);
			++n;
			
			number(n);
			
			
		}
		
	}

	public static void main(String[] args) {
		
		number(1);

	}

}
