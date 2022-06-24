package practicePrograms;

interface GrandParent
{
	public void fun();

}
interface Parent1 extends GrandParent
{
	public void fun();

	
}

interface Parent2 extends GrandParent
{
	
	public void fun();

}

class Test implements Parent1 , Parent2
{
	public void fun()
	{
		System.out.println("I am in Test Class Parent2 fun method defined here");
	}
}

public class DemoHybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		t.fun();
		

	}

}