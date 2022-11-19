package demoInputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = { 10,20,30,40,255 };
		FileOutputStream f;
		try {
		f = new FileOutputStream("file123.txt");
		for(int i = 0;i < data.length;i++)
		f.write((char)data[i]);
		f.close();
		} catch (IOException e) {
		System.out.println("Error with files:"+e.toString());
		}
	}

}
