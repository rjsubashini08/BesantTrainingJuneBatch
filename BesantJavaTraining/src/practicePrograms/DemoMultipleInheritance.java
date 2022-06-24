package practicePrograms;


interface MultipleParent1 
{
	public void fun();//declaration

	
}

interface MultipleParent2
{
	
	public void fun();//declaration

}

class MultipleParent3
{
	public void fun()
	{
		System.out.println("I am in Multiple Parent 3");
	}
}


class MultipleTest extends MultipleParent3 implements MultipleParent1 , MultipleParent2
{
	public void fun()
	{
		System.out.println("I am in Test Class Parent2 fun method defined here");
	}
}

public class DemoMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleTest t=new MultipleTest();
		t.fun();
		MultipleParent3 m3=new MultipleParent3();
		m3.fun();
		

	}

}