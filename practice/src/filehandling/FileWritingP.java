package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome to my wolrd. Hello i am neel here";
		
		try {
			BufferedWriter bf=new BufferedWriter( new FileWriter("p.txt"));
			bf.write(s);
			bf.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("data is enterd");

	}

}
