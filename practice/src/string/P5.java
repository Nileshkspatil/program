package string;

public class P5 {
	public static char [] sort(char [] a) {
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="act";
		String s2="cat";
		boolean b=true;
		
		if(s1.length()==s2.length()) {
			char [] ch1=s1.toCharArray();
			char [] ch2=s2.toCharArray();
			
			sort(ch1);
			sort(ch2);
			
			for (int i = 0; i < ch2.length; i++) {
				
				if(ch1[i]!=ch2[i]) {
					b=true;
				}
			}
			if(b==true) {
				System.out.println("String is anagram");
			}else {
				System.out.println("String is not anagram");
			}
 			
			
		}else {
			System.out.println("String is not anagram");
		}

	}

}
