package demoInheritance;

class Employee//SuperClass-single
{
	float salary;
	
	public void readPrintSalary()
	{
		salary=30000;
		System.out.println("Employee Salary is "+salary);
	}
}

class Programmer extends Employee//SubClass-1
{
int bonus;
	
	public void readPrintBonus()
	{ bonus=10000;
		System.out.println("Programmer Bonus Amount is "+bonus);
	}
	
}

class Tester extends Employee//Subclass-2
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
		Programmer prog=new Programmer();//Sub Class
		prog.readPrintSalary();//property of Super Class/Parent Class
		prog.readPrintBonus();//property of Sub Class/Child Class
		
		Tester test=new Tester();//Sub Class
		test.redPrintTesterBonus();//property of sub Class/Child class
		

	}

}
