package demoInheritance;

import demoBookClassPractice.Book;//UserDefined packages

public class InstanceOfGetClass {
	public static void main(String[] args) {
		Book b1 = new Book("Thinking in Java","Bruce Eckel",1129);
		ScientificBook sb1 = new ScientificBook("Neural Networks",
		"Simon Haykin",696,"0-02-352761-7", null);
//		"Artificial Intelligence");
		System.out.println(b1.getClass().getName());
		System.out.println(sb1.getClass().getName());
		System.out.println(b1 instanceof Book);
		System.out.println(sb1 instanceof Book);
		System.out.println(b1 instanceof ScientificBook);
		System.out.println(sb1 instanceof ScientificBook);
		}
		}