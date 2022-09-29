package demoClassVariableStatic;
class Book {
	//instance Variable-object
	String title;
	String author;
	int numberOfPages;
	String ISBN;
	//Class Variable-Single Copy
	static String owner;
	
	public Book(String tit,String aut,int nop)
	{
		title=tit;
		author=aut;
		numberOfPages=nop;
	}
	public void setOwner(String name) {
	owner = name;
	}
	public String getOwner() {
	return owner;
	}
	}
public class ExampleBooks8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1,b2;
		b1 = new Book("Thinking in Java","Bruce Eckel",1129);//instance Variable
		b2 = new Book("Java in a nutshell","David Flanagan",353);//instance Variable
		b1.setOwner("Carlos Kavka");//class Variable
		b2.setOwner("Carlos Kavka second");
		System.out.println("Owner of book b1: " + b1.getOwner());
		System.out.println("Owner of book b2: " + b2.getOwner());
	}

}
