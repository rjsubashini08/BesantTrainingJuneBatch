package staticDemo;
class Book8 {
	//instance Variable-heapArea-Object
String title;
String author;
int numberOfPages;
String ISBN;
//Class Memory/Stack Memory//ClassName
static String owner;
public Book8(String tit,String auth,int nop)
{
	title=tit;
	author=auth;
	numberOfPages=nop;
	
}
public void setOwner(String name) {
owner = name;
}
public String getOwner() {
return owner;
}
public static String description() {
return "Book instances can store information on books";
}
}
public class ExampleBooks8 {
	public static String descriptionMain() {
		return "Main Book instances can store information on books";
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book8 b1,b2;
		b1 = new Book8("Thinking in Java","Bruce Eckel",1129);//123
		b2 = new Book8("Java in a nutshell","David Flanagan",353);//321
		b1.setOwner("Static1Carlos Kavka");
		b2.setOwner("Static2Carlos Kavka");
		System.out.println("Owner of book b1: " + b1.getOwner());
		System.out.println("Owner of book b2: " + b2.getOwner());
		System.out.println(b1.description());
		System.out.println(Book8.description());
		System.out.println(descriptionMain());
	}

}
