package commandLineargument;

public class CommandArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		for(int i=0;i<args.length;i++)
		{ 	
			System.out.print(args[i]);
			System.out.print(" ");
		}
	}

}
