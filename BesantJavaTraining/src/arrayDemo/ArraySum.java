package arrayDemo;

public class ArraySum {

	public static void main(String args[])
	{
		//Array-Collection of elements of Similar datatypes
		//Arrays can accessed using index
		int[] ia= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<ia.length;i++)
		{
			System.out.println(ia[i]);
			sum=sum+ia[i];
		}
		System.out.println(sum);
		
		String[] str= {"Hello","I","am","in","Java","training"};
		for(int i=str.length-1;i>0;i--)
		{
			System.out.println(str[i]);
			
		}
		
		String astr="I am in Besant Training";
		String[] strsplit=astr.split(" ");
		for(int i=0;i<strsplit.length;i++)
		{System.out.print(" ");
			System.out.print(strsplit[i]);
			
		}
		System.out.println();
		for(int i=strsplit.length-1;i>=0;i--)
		{System.out.print(" ");
			System.out.print(strsplit[i]);
			
		}
	}
}
