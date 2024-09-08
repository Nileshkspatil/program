package com.simple;

public class P3 {
	
	public static void isPrime(int n) {
		int count=0;
		if(n==0|| n==1) {
			System.out.println("not prime number");
		}else {
			for(int i=1; i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(n+":  prime ");
			}else {
				System.out.println(n+": number is not  prime");
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPrime(11);
		isPrime(0);
		

	}

}
