package demoBookClassPractice;

public class Book {
	
	//Instance Variable
	
	String title;
	String author;
	int numberOfPages;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Object
		//ClassName objectName=new ClassName();
		Book bookObj=new Book();
		bookObj.title="CharlesBook";
		bookObj.author="CharlesAuthor";
		bookObj.numberOfPages=1129;
		
		System.out.println("Title of the Book "+bookObj.title);
		System.out.println("Author of the Book "+bookObj.author);
		System.out.println("Number of pages of the Book "+bookObj.numberOfPages);
		
		
	}

}
