package demoCollection;

import java.util.*;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set=new HashSet();
		set.add("one");
		set.add("second");
		set.add("third");
		set.add("third");
		set.add(1);
		set.add(1);
		set.add(new Integer(50));
		set.add(new Integer(50));
		System.out.println(set);
	}

}
