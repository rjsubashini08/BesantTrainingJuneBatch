package demoInheritance;

interface MultipleParent1 //Super class -1
{
	//static and final variable
	//methods have only declaration and public
	//interface never be instantiated/never create object
	//using implements keyword we can inherit
	
	public void fun();//declaration	
}

interface MultipleParent2//Super class -2
{
	
	public void fun();//declaration

}

class MultipleParent3//Super class -3
{
	public void fun()
	{
		System.out.println("I am in Multiple Parent 3");
	}
}


class MultipleTest extends MultipleParent3 implements MultipleParent1 , MultipleParent2//Subclass-1
{
	//implementation in Subclass and decllaration is presnt in interface Super class
	
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