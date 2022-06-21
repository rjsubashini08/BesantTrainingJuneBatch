package methodDemo;
class Book {
//Instance Variable
String title;
String author;
int numberOfPages;
String ISBN;
//Constructor
public Book(String tit,String auth,int nop)
{
	this.title=tit;
	this.author=auth;
	this.numberOfPages=nop;
	this.ISBN="Unkonwn";
}
//method
// compute initials of author's name
public String getInitials() {
String initials = "";
for(int i = 0;i < author.length();i++) {
char currentChar = author.charAt(i);
if (currentChar >= 'A' && currentChar <='Z')
initials = initials + currentChar + '.';
}
return initials;
}

public void printMethod()
{
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("NOP: "+numberOfPages);
	System.out.println("ISBN: "+ISBN);
}
}
public class ExampleBooks4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b;
		b = new Book("Thinking in Java","Bruce Eckel",1129);
		System.out.println("Initials: " + b.getInitials());
		b.printMethod();
		//Array Of Objects
		Book[] a=new Book[3];
		a[0] = new Book("Array1 Thinking in Java","BArray1 CBruce DEckel",1129);
		a[1] = new Book("Array2 Thinking in Java","HArray2 KBruce LEckel",1200);
		a[2] = new Book("Array3 Thinking in Java","IArray3 JBruce MEckel",1300);
		for(int i=0;i<a.length;i++)
		{
			a[i].printMethod();
		System.out.println("Initials: " + a[i].getInitials());
		}
	}

}
