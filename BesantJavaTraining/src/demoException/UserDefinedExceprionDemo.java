package demoException;
class MyException extends Exception {
	String msg;
	
	public String getMessage(String message)
	{
		msg=message;
		System.out.println("Hello I am in Exception method");
		return msg;
	}
}
public class UserDefinedExceprionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Throw an object of user defined exception
            throw new MyException();
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage("Hello"));
        }
	}

}
