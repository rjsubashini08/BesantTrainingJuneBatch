package classObjectDemo;
class Books
{
	/*
	
	A class — in the context of Java — is a template used to 
	create objects
	 and to define object data types and methods.

	Classes are categories, and objects are items within each category.

	All class objects should have the basic class properties.

	Core properties include the actual attributes/values and methods
	 that may be used by the object.
	
	*/
	
	/*
	 * A Java object is a member (also called an instance) 
	 * of a Java class. Each object has an identity, a behavior
	 *  and a state.

The state of an object is stored in fields (variables), 
while methods (functions) display the object's behavior. 
Objects are created at runtime from templates, 
which are also known as classes.

In Java, an object is created using the keyword "new".
	 */
	
	//Instance Variable
	//variable specified inside the class
	//access using object dot operator
	
	String title;
	String author;
	int numberOfPages;
}
public class ExampleBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object creation
		//className objectName=new className();
		Books b=new Books();
		b.title="Thinking in Java";
		b.author="Bruce Eckel";
		b.numberOfPages=1132;
		System.out.println("Title of the Books "+b.title);
		System.out.println("Author of the Books "+b.author);
		System.out.println("NumberOfPages of the Books "+b.numberOfPages);
		

	}

}
