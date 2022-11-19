package demoInheritance;
class Animal//Super class
{
	//Cast means conversion of one DataType/Object to another
	//RunTime Polymorphism
	public int eat()
	{
		System.out.println("Animal Eating");
		return 0;
	}
}

class Dog extends Animal//Sub class
{
	public int eat()
	{
		System.out.println("Dog Eating");
		return 0;
	}
}

public class DemoMethodOverriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dg=new Dog();//Overriden subclass object
		dg.eat();
		Animal a=new Animal();//super class object
		a.eat();
		
		Animal as=new Dog();//overideen subclass object and the references from super class
		as.eat();
		
//		Dog d1=(Dog) new Animal();
//		d1.eat();

	}

}