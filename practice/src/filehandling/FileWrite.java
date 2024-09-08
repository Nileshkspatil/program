package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="welocme to my world";
		String s=" iam nilesh patil";
				
				
		
		try {
			BufferedWriter fw=new BufferedWriter(new FileWriter("abc.txt"));
			fw.write(text);
			fw.write(s);
			System.out.println(text);
			System.out.println("file ceated");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
