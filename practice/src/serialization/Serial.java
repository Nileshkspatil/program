package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Student student=new Student("Nilesh patil","nileshpatil247@gmail.com",29,"mumbai");
		
		try {
			FileOutputStream fos= new FileOutputStream("ob.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			//how to serialize
			
			oos.writeObject(student);
			oos.close();
			fos.close();
			System.out.println("object stated in file!!!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
