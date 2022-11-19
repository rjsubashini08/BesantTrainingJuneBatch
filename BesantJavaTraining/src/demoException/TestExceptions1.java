package demoException;

public class TestExceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		try
		{
		System.out.print(s.charAt(10));
		}
		
		catch(StringIndexOutOfBoundsException s1)
		{
			System.out.println(s1.getMessage());
			s1.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
