
public class SingletonDesignPattern {
	int a;
	public SingletonDesignPattern(int ap)
	{
		this.a=ap;
		
	}
	

	
 public static void main(String args[])
 {
 SingletonDesignPattern sd=new SingletonDesignPattern(10);
 System.out.println(sd);
}
 
}
