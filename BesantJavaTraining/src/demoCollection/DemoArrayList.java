package demoCollection;


import java.util.*;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("one");
		list.add("second");
		list.add("third");
		list.add("third");
		list.add(1);
		list.add(1);
		list.add(new Integer(50));
		list.add(new Integer(50));
		System.out.println(list);
	}

}
