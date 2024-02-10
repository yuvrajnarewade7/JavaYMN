package Polymorphism;

public class Overloading {

	public void add (int a, int b) {
		
		System.out.println("Add 2 numbers ");
	}
	
	public void add (int a, int b, int c) {
		
		System.out.println("Add 3 numbers ");
	}
	
	public static void main (String [] args) {
		Overloading obj = new Overloading();
		obj.add(1, 2);
		obj.add(1, 2, 3);
		
		
	}

}
