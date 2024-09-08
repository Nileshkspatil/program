package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DserialiseE {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis=new FileInputStream("employee.txt");
			ObjectInputStream ois= new ObjectInputStream(fis);
			
			Employee e=(Employee)ois.readObject();
			
			System.out.println(e.getEname()+": " +e.getEid()+":"+e.getEmail());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
