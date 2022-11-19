package abstractDemo;
//Super Class(abstarct Class)
abstract class IOBoard {
	
//Any variable
//methods can have both implemented methods as well as declared methos
//abstract class never be instantiated/never create object
//using extends keyword we can inherit
//instance Variable
String name;
int numErrors = 0;
//IOBoard Constructor-className and MethodName
//initialize the instance variable
//invoked through Object
IOBoard(String s) {
System.out.println("IOBoard constructor");
name = s;
}
//final methods/Non abstract methods contains implementtaion
final public void anotherError() {
numErrors++;
}
final public int getNumErrors() {
return numErrors;
}
//abstract methods-contains declaration its 
//impelemnetation present in subclass
abstract public void initialize();
abstract public void read();
abstract public void write();
abstract public void close();
}
//Subclass
class IOSerialBoard extends IOBoard {
int port;
//constrctor
IOSerialBoard(String s,int p) {
super(s); port = p;
System.out.println("IOSerialBoard constructor");
}
public void initialize() {
System.out.println("initialize method in IOSerialBoard");
}
public void read() {
System.out.println("read method in IOSerialBoard");
}
public void write() {
System.out.println("write method in IOSerialBoard");
}
public void close() {
System.out.println("close method in IOSerialBoard");
}
}
//Subclass
class IOEthernetBoard extends IOBoard {
int port;
//constrctor
IOEthernetBoard(String s,int p) {
super(s); port = p;
System.out.println("IOEthernetBoard constructor");
}
public void initialize() {
System.out.println("initialize method in IOEthernetBoard");
}
public void read() {
System.out.println("read method in IOEthernetBoard");
}
public void write() {
System.out.println("write method in IOEthernetBoard");
}
public void close() {
System.out.println("close method in IOEthernetBoard");
}
}

public class TestBoards1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation 
		IOSerialBoard serial = new IOSerialBoard("my first port",0x2f8);
				serial.initialize();
				serial.read();
				serial.close();
				
			IOBoard[] boards=new IOBoard[3];
			boards[0]=new IOSerialBoard("my first port",0xf123);
			boards[1]=new IOEthernetBoard("my second port",0xf12323);
			boards[2]=new IOEthernetBoard("my third port",0xf1576723);
			
			for(int i=0;i<3;i++)
			{
				boards[i].initialize();
			}
			for(int i=0;i<3;i++)
			{
				boards[i].read();
			}
			for(int i=0;i<3;i++)
			{
				boards[i].close();
			}
			
			}
			
				}
				
