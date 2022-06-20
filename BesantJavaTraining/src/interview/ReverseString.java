package interview;

public class ReverseString {
	
	public String reverse(String st)
	{
		String[] split=st.split(" ");
		Strin rev="";
//		String rev1=null;
		for(int i=split.length-1;i>=0;i--)
		{
			
//			System.out.print(split[i]+" ");
			rev=rev+" "+split[i];
			
			
		}
		System.out.println(rev);
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs=new ReverseString();
		String str="I am giving interview to goto";
		rs.reverse(str);
		
	}

}
