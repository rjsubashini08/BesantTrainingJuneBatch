package constructorDemo;
class BooksExample
{
	String title;
	String author;
	int numberOfPages;
	String ISBN;
	
	public BooksExample(String tit,String auth,int nop)
	{
		this.title=tit;
		this.author=auth;
		this.numberOfPages=nop;
		this.ISBN="Unkonwn";
	}
	public BooksExample(String tit,String auth,int nop,String isbn)
	{
		this.title=tit;
		this.author=auth;
		this.numberOfPages=nop;
		this.ISBN=isbn;
	}
}
public class BooksExampleConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BooksExample be=new BooksExample("Thinking in Java","Bruce Eckel",1132);
		System.out.println("Title of the Books "+be.title);
		System.out.println("Author of the Books "+be.author);
		System.out.println("NumberOfPages of the Books "+be.numberOfPages);
		BooksExample be1=new BooksExample("Thinking in Java","Bruce Eckel",1132,"SE-123456789");
		System.out.println("Title of the Books "+be1.title);
		System.out.println("Author of the Books "+be1.author);
		System.out.println("NumberOfPages of the Books "+be1.numberOfPages);
		System.out.println("ISBNL "+be1.ISBN);

	}

}
