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
}
public class ExampleBooks4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b;
		b = new Book("Thinking in Java","Bruce Eckel",1129);
		System.out.println("Initials: " + b.getInitials());
	}

}
