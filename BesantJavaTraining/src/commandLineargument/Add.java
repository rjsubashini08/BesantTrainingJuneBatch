package commandLineargument;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.out.println("Error");
			System.exit(0);
			}
			int arg1 = Integer.parseInt(args[0]);
			int arg2 = Integer.parseInt(args[1]);
			System.out.println(arg1 + arg2);
	}

}
