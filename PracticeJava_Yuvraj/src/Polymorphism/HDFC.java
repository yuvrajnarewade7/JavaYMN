package Polymorphism;

public class HDFC extends RBI{

	public double getHomeLoanInt() {
		System.out.println("this is HDFC interest");
		return 9.5; 
	}

	
//	public double getCarLoanInt() {
//		
//		return 12.25;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFC obj1 = new HDFC();
		System.out.println(obj1.getHomeLoanInt());
		
		
	
	}

}
