package demoThread;
class CharThread extends Thread {
char c;
CharThread(char aChar) {
c = aChar;
}
public void run() {
while (true) {
System.out.println(c);
try {
sleep(100);
} catch (InterruptedException e) {
System.out.println("Interrupted");
}
}
}
}
public class TestThreads {

	public static void main(String[] args) {
		CharThread t1 = new CharThread('a');
		CharThread t2 = new CharThread('b');
		t1.start();
		t2.start();
		}
		}
