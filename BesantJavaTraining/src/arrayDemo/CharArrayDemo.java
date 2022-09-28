package arrayDemo;

public class CharArrayDemo {
	
	public char[] createArray()
	{
		char[] s=new char[26];
		for(int i=0;i<26;i++)
		{
			s[i] = (char)('a' + i);
		}
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharArrayDemo cad=new CharArrayDemo();
		char[] alp=cad.createArray();
		for(int i=0;i<26;i++)
		{
			System.out.println(alp[i]);
		
		}
	}

}
