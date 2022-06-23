package instanceVariableInitialisation;

import java.awt.print.Book;

class Values {
int x;
float f;
String s;
Book b;

int x2 = 2;
float f2 = inverse(x2);
String s2;
Book b2;
Values(String str) { s2 = str; }
public float inverse(int value) { return 1.0F / value;
}
}
public class InitialValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Values v = new Values("Hi");
		System.out.println(v.x);
		System.out.println(v.f);
		System.out.println(v.s);
		System.out.println(v.b);
		Values v1 = new Values("hello");
		System.out.println("" + v1.x2 + "\t" + v1.f2);
		System.out.println("" + v1.s2 + "\t" + v1.b2);
	}

}
