package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis=new FileInputStream("ob.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student student=(Student) ois.readObject();
			student.displayName();
			System.out.println(student.getEmail());
			System.out.println(student.getAddress());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
