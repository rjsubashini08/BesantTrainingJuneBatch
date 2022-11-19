package demoClassVariableStatic;

class Book9
{
	//Instance Variable-this
	String title;
	String author;
	int numberOfPages;
	String ISBN;
	
	//Static variable
	static String owner;
	
	//constructor-
	public Book9(String tit,String auth,int nop,String isbn )
	{
		this.title=tit;
		this.author=auth;
		this.numberOfPages=nop;
		this.ISBN=isbn;
	}
	public void setOwner(String own)
	{
		owner=own;
		
	}	
	public String getOwner()
	{
		return owner;
		
	}	
	public static String description()
	{
		return "This is Simple Java Book";	
	}	
}
public class ExampleBooks9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book9 b9=new Book9("New Java Book","JavaAuthor",500,"SL-12345");
		b9.setOwner("OwnerName");
		String own=b9.getOwner();
		
		System.out.println("Title of the book "+b9.title);
		System.out.println("Author of the book "+b9.author);
		System.out.println("Number of Pages of the book "+b9.numberOfPages);
		System.out.println("ISBN of the book "+b9.ISBN);
		System.out.println("Owner of the book "+own);
		System.out.println(Book9.description());
		System.out.println(b9.description());

	}

}
