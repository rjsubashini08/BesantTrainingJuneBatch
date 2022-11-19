package thisOperatorDemo;

public class DemoMultipleConstructorThis {
	String title;
	String author;
	int numberOfPages;
	String ISBN;
	
	//3 Parameters
	public DemoMultipleConstructorThis(String tit,String aut,int nop)
	{
		title=tit;
		author=aut;
		numberOfPages=nop;
		
	}
	
	//4 Parameters
	public DemoMultipleConstructorThis(String tit,String aut,int nop,String isbn)
	{
		this(tit,aut,nop);
		ISBN=isbn;
	}
	
	public static void main(String args[])
	{
		DemoMultipleConstructorThis dmct=new DemoMultipleConstructorThis("Thinking In Java","Buckel Eicher",1134,"SL54321");
		System.out.println("Title of the Book "+dmct.title);
		System.out.println("Author of the Book "+dmct.author);
		System.out.println("Number Of Pages of the Book "+dmct.numberOfPages);
		System.out.println("ISBN of the Book "+dmct.ISBN);
	}
	

}
