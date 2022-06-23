package practicePrograms;
//Single as well as Hierarchial inheritance
//Inheritance -acquiring the properties(data members and members functions) of one class to the another class 
//keyword extends
//parent or Super class or derived class
//child class or sub class or deriving class
//aLWAYS create object for child class

 class Employee
{
	float salary;
	
	public void readPrintSalary()
	{
		salary=30000;
		System.out.println("Employee Salary is "+salary);
	}
}

class Programmer extends Employee
{
int bonus;
	
	public void readPrintBonus()
	{ bonus=10000;
		System.out.println("Programmer Bonus Amount is "+bonus);
	}
	
}

class Tester extends Employee
{
	int testerBonus;
	
	public void redPrintTesterBonus()
	{
		testerBonus=20000;
		
		System.out.println("Tester Bonus Amount is "+testerBonus);
	}
	
}

public class DemoSingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sub Class Object
		Programmer prog=new Programmer();
		//Using SubClass Object accessing both
		//Superclass as well as Subclass properties
		prog.readPrintSalary();
		prog.readPrintBonus();
		
		Tester test=new Tester();
		test.redPrintTesterBonus();
		

	}

}