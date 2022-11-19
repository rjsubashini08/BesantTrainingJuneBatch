package demoClassVariableStatic;

public class StaticVariableMethods {

	//Static Variable
	 static int x;
	 static String s;
	
	//Static method
	//AccessSpecifier AccessModifier Returntype MethodName()
	public  static String asString(int anumber)
	{
		return ""+anumber;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x=165;
		s=asString(x);
		System.out.println(s);
	}

}
