package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("neel.txt.txt"));
			
			String ss;
			while((ss=br.readLine())!=null) {
				System.out.println(ss);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
