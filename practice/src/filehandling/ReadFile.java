package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("abc.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String st;
		while(( st=br.readLine())!=null) {
			System.out.println(st);
		}

	}

}
