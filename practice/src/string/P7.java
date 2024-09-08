package string;

import java.util.Arrays;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [ ] s= {"goa", "daman", "mp","himacal"};
		
		int small=0;
		for (int i = 1; i < s.length; i++) {
			
			if(s[small].length()>s[i].length()) {
				small=i;
			}
			
		}
		System.out.println(s[small]);

	}

}
