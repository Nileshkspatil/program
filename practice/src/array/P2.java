package array;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] n= { 70,34,9,56,21,9,45,6};
		
		int large=n[0], slarge=0;
		
		for (int i = 1; i < n.length; i++) {
			
			if(large<n[i]) {
				slarge=large;
				large=n[i];
			} else if(n[i]>slarge && n[i]!=large) {
				slarge=n[i];
			}
			
			
			
		}
		System.out.println(slarge);
	}

}
