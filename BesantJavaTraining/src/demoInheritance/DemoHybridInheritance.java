package demoInheritance;
interface GrandParent//super class
{
	public void fun();//declaration
	
}

class parent1 implements GrandParent//subclass 1 with single superclass//Hierarchical
{
	public void fun()
	{
		System.out.println("I am in Parent1 fun method");
	}
}

interface parent2 extends GrandParent//subclass 2 with single superclass
{
	public void fun();
}

class Test extends parent1 implements parent2//multiple-subclass 1 with multiple super class
{
	public void fun()
	{
		System.out.println("I am in Sub Class fun method");
	}
}
public class DemoHybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.fun();
		parent1 p=new parent1();
		p.fun();
	}

}
