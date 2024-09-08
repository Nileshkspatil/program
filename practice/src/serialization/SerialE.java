package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialE {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Employee e=new Employee(21,"mukesh patil", "mukesh123@gmail.com");
		
		
		try {
			FileOutputStream fo= new FileOutputStream("employee.txt");
			ObjectOutputStream ob=new ObjectOutputStream(fo);
			ob.writeObject(e);
			ob.close();
			fo.close();
			System.out.println("object is serialized");
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
