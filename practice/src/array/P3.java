package array;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= { 70,34,9,56,21,9,45,6};
		
		int search=21;
		boolean b=true;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==search) {
				System.out.println("element is present at index:"+ i);
				b=false;
				break;
			}
		}
		if(b==true) {
			System.out.println("element is not present");
		}

	}

}
