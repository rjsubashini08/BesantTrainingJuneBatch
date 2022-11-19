package demoClassVariableStatic;
class Values {
int x = 2;
float f = inverse(x);
String s;
Book b;
Values(String str) { s = str; }
public float inverse(int value) { return 1.0F / value; }
}
public class InitialValues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Values v = new Values("hello");
		System.out.println("" + v.x + "\t" + v.f);
		System.out.println("" + v.s + "\t" + v.b);
	}

}
