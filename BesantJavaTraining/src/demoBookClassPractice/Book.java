package demoBookClassPractice;



public class Book {
	
	//Instance Variable
	
	String title;
	String author;
	int numberOfPages;

	
	
	public Book(String tit,String aut,int nop)
	{
		title=tit;
		author=aut;
		numberOfPages=nop;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Object
		//ClassName objectName=new ClassName();
		Book bookObj;
		bookObj = new Book("Thinking in Java","Bruce Eckel",1129);//instance Variable
		
		bookObj.title="CharlesBook";
		bookObj.author="CharlesAuthor";
		bookObj.numberOfPages=1129;
		
		System.out.println("Title of the Book "+bookObj.title);
		System.out.println("Author of the Book "+bookObj.author);
		System.out.println("Number of pages of the Book "+bookObj.numberOfPages);
		
		
	}

}
