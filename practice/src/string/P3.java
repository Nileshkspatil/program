package string;

public class P3 {
	
	public static void isPalindrome(String s) {
		
		s=s.trim();
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="level ";
		isPalindrome(s);
		String ch="nilsh";
		isPalindrome(ch);

	}

}
