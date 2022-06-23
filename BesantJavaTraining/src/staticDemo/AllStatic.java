package staticDemo;

public class AllStatic {
	//Static Variable//Class Variable
	static int x;
	static String s;
	//Static Method
	public static String asString(int aNumber) {
	return "" + aNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x = 165;
		s = asString(x);
		System.out.println(s);
	}

}
