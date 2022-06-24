package twoPackage;

import onePackage.OnePackageClassA;

public class TwoPackageClassBSubClass extends OnePackageClassA
{
	public static void main(String[] args)
	{
	TwoPackageClassBSubClass tps=new TwoPackageClassBSubClass();
	System.out.println(tps.a);
}
}
