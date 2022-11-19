package demoException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample {

	
		// TODO Auto-generated method stub
		public static void main(String args[]) throws IOException {  
	        FileInputStream file_data = null;  
	        try
	        {
	        file_data = new FileInputStream("C:\\Users\\Sony\\Desktop\\DemoTest.java");  
	       }
	        catch(FileNotFoundException fnf)
	        {
	        	
	        	System.out.println("File not present in this path"+fnf);
	        	
	        }
	        
	        int m; 
	        
	        try
	        {
	        while(( m = file_data.read() ) != -1) {  
	            System.out.print((char)m);  
	        }  
	        file_data.close(); 
	        }
	        catch(NullPointerException npe)
	        {
	        	System.out.println("Since file itself not found getting NUllPointer error"+npe);
	        }
	    }  

	}