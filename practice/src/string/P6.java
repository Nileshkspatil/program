package string;

public class P6 {
	
	public static void removeVowels(String s) {
		
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]=='a'|| ch[i]=='i'|| ch[i]=='e'|| ch[i]=='o'|| ch[i]=='u') {
				ch[i]='%';
			}
		}
		s=new String(ch);
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="maharastra";
		String s2="me";
		removeVowels(s1);
		removeVowels(s2);
		

	}

}
