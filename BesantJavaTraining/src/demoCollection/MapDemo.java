package demoCollection;

import java.util.*;

public class MapDemo {
public static void main(String[] args) {
			// TODO Auto-generated method stub
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(1, "Hello");
	m.put(2, "20");
	m.put(3, "1000");
	m.put(4, "HelloIAm4");
	m.put(1, "Hello1");
	m.put(1, "Hello2");
	m.put(1, "Hello3");

	Set s=m.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext())
	{
//		System.out.println(it.next());
		Map.Entry entry=(Map.Entry) it.next();
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
//	for(Map.Entry me:m.entrySet())
//	{
//		System.out.println(me.getKey()+"  "+me.getValue());
//	}

		}

	}