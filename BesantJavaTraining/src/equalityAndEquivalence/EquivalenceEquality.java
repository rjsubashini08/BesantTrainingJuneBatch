package equalityAndEquivalence;



class BookEquivalence {
	//Instance Variable
	String title;
	String author;
	int numberOfPages;
	String ISBN;
	//Constructor
	public BookEquivalence(String tit,String auth,int nop)
	{
		this.title=tit;
		this.author=auth;
		this.numberOfPages=nop;
		this.ISBN="Unkonwn";
	}
}
public class EquivalenceEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookEquivalence b1 = new BookEquivalence("Thinking in Java","Bruce Eckel",1129);//123
		BookEquivalence b2 = new BookEquivalence("Thinking in Java","Bruce Eckel",1129);//323
		
		if(b1==b2)
		{
			System.out.println("b1 == b1 True");
		}
		else
			System.out.println("b1 == b1 False");
		
		String a="Hello";//321
		String b=a;//321
		 b="Hello1";
		if(a.equals(b))
		{
			System.out.println("Both the Objects are Same");
		}
		else
			System.out.println("Both the Objects are difference");

	}

}
