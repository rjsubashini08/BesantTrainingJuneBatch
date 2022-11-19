package demoException;

public class TryCatchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int data=50/0; //may throw exception   =0.000000000000000000000infine
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        System.out.println("rest of the code"); 
       
	}

}
