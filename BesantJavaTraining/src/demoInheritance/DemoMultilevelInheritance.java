package demoInheritance;
class A
{
	int a=100;
	
	public void printA()
	{
		System.out.println(a);
	}
	
	
}

class B extends A
{
	
	int b=200;
	
	public void printB()
	{
		System.out.println(b);
	}
}

class C extends B
{
	
int c=300;
	public void printC()
	{
		System.out.println(c);
	}
}
public class DemoMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C();
c.printA();
c.printB();
c.printC();
	}

}
