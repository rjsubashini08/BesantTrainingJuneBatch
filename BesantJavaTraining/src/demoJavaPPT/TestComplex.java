package demoJavaPPT;
class Complex//Interface  Abstract class-method declaration only
{
	double real;
	double im;
	
	 Complex(double re,double i)
	{
		real=re;
		im=i;
	}
	double getReal()
	{
		return real;
	}
	double getImaginary()
	{
		return im;
	}
	
	Complex add(Complex x)
	{
		return new Complex(real+x.real,im+x.im);
		
	}
	Complex sub(Complex c)
	{
		return new Complex(real-c.real,im-c.im);
		
	}
}
public class TestComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex a=new Complex(1.33,4.64);
		Complex b=new Complex(3.18,2.74);
		Complex c=a.add(b);
		Complex d=c.sub(a);
		System.out.println("C=A+B "+c.getReal()+" "+c.getImaginary());
		System.out.println("D=C-A "+d.getReal()+" "+d.getImaginary());
	}

}
