package controlStructureDemo;

public class ContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int counter = 0;counter < 10;counter++) {
			// start a new iteration if the counter is odd
			if (counter % 2 == 1) continue;
			// abandon the loop if the counter is equal to 8
			if (counter == 8) break;
			// print the value
			System.out.println(counter);
			}
			System.out.println("done.");	
}
	}


