package demoInputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f;
		try {
		f = new FileInputStream("file1.data");
		int data;
		while((data = f.read()) != -1)
		System.out.println(data);
		f.close();
		} catch (IOException e) {
		System.out.println("Error with files:"+e.toString());
		}
	}

}
