package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCreation {
public static void main(String args[])
{
	ArrayList<String> al=new ArrayList<String>();
	al.add("Hi");
	al.add("Hello");
	al.add("Besant");
	al.add("Technology");
	al.add("Java");
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
