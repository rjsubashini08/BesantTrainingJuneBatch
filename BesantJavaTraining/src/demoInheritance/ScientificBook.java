package demoInheritance;

import demoBookClassPractice.Book;

public class ScientificBook extends Book  {
 String typeBook;
	public ScientificBook(String tit, String aut, int nop,String tyb, String string) {
		super(tit, aut, nop);
		// TODO Auto-generated constructor stub
		typeBook=tyb;	
	}

	
}
