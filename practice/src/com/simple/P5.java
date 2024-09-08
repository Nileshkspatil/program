package com.simple;

public class P5 {
	
	public static int pow(int p, int q) {
		int res=1;
		for(int i =1; i<=q;i++ ) {
			res=p*res;
		}
	//	System.out.println(res);
		return res;
	}
	
	public static int countOf(int n) {
		int count=0;
		while(n!=0) 
		{
			count++;
			n=n/10;
			
		}
		System.out.println(count);
		return count;
		
	}
	public static void isArmStrong(int n) {
		int temp=n, sum=0;
		int count=countOf(n);
		
		while(n!=0) {
			int d=n%10;
			sum=sum+pow(d,count);
			n=n/10;
			
		}
		
		
		if(sum==temp) {
			System.out.println(temp+": is Armstrong number");
		}else {
			System.out.println("not Armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmStrong(153);
		

	}

}
