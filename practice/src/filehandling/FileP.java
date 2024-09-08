package filehandling;

import java.io.File;
import java.io.IOException;

public class FileP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("p.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file is creaated");
		
		

	}

}
