package demoClassVariableStatic;
class Book {
	//instance Variable-object
	String title;
	String author;
	int numberOfPages;
	String ISBN;
	String owner;
	
	public Book(String tit,String aut,int nop)
	{
		title=tit;
		author=aut;
		numberOfPages=nop;
	}
	public Book setOwner(String name) {
	owner = name;
	return this;
	}
	public String getOwner() {
	return owner;
	}
	public String getInitials() 
	{
		String initials = "";
		
		for(int i = 0;i < owner.length();i++) 
		{
		char currentChar = owner.charAt(i);
		if (currentChar >= 'A' && currentChar <='Z')
		{
		initials = initials + currentChar + '.';
		}
		}
		return initials;
	}
	}
public class ExampleBooks8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1,b2;
		b1 = new Book("Thinking in Java","Bruce Eckel",1129);//instance Variable
		b2 = new Book("Java in a nutshell","David Flanagan",353);//instance Variable
		b1.setOwner("Carlos Kavka").getInitials();//class Variable
		b2.setOwner("Carlos Kavka Second").getInitials();
		System.out.println("Owner of book b1: " + b1.getOwner());
		System.out.println("Owner of book b2: " + b2.getOwner());
		System.out.println(b1.setOwner("Carlos Kavka").getInitials());
		System.out.println(b2.setOwner("Carlos Kavka Scond").getInitials());
	}

}
