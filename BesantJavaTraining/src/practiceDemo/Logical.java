package practiceDemo;

public class Logical {

	//Method=Main=Program execution
	public static void main(String[] args) {
		int x = 12,y = 33;
		double d = 2.45,e = 4.54;
		System.out.println(x < y && d < e);
		System.out.println(!(x < y));
		boolean test = 'a' > 'z';
		System.out.println(test);
		System.out.println(test || d - 2.1 > 0);
		}
		}

/*

&&(X)
T  T  T
T  F  F
F  F  F
F  T  F

||(0+1=1)

T  T  T
T  F  T
F  F  F
F  T  T



*/