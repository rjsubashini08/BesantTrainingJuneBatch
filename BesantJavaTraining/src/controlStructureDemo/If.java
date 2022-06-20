package controlStructureDemo;

public class If {
	public static void main(String[] args) {
		char c = '#';
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		System.out.println("letter: " + c);
		else
		if (c >= '0' && c <= '9')
		System.out.println("digit: " + c);
		else {
		System.out.println("the character is: " + c);
		System.out.println("it is not a letter");
		System.out.println("and it is not a digit");
		}
		}
		}