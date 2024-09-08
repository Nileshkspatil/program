package string;

import java.util.Arrays;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="maharastra";
		
		char [] ch=s.toCharArray();
		boolean [] b= new boolean[ch.length];
		//System.out.println(Arrays.toString(b));
		
		for (int i = 0; i < ch.length; i++) {
			
		 if(b[i]==false) {
			 
			 int count=1;
			 
			 for (int j = i+1; j < b.length; j++) {
				 
				 if(ch[i]==ch[j]) {
					 count++;
					 b[j]=true;
				 }
				
			}
			 System.out.println(ch[i]+":"+count);
		 }
			
		}
		System.out.println(Arrays.toString(b));
	}

}
