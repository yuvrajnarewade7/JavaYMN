
public class ` {
	
	public int addition(int num1, int num2) {
		
		int sum = num1+num2; 
		return sum;
	}
	
public int subtraction(int num1, int num2) {
		
		int difference = num1-num2; 
		return difference;
	}
	
public int multiplication(int num1, int num2) {
	
	int product = num1*num2; 
	return product;
}

public int division(int num1, int num2) {
	
	int quotient = num1/num2;
	return quotient;
}

public int remainder(int num1, int num2) {
	
	int remainder = num1%num2;
	return remainder;
}

	public static void main (String[] args) {
		
		int a = 25;
		int b = 10;
		Calculator obj = new Calculator();
		int addition = obj.addition(a,b);
		System.out.println("Sum of "+ a + " and " + b + " = " + addition); 
		
		int difference = obj.subtraction(a,b);
		System.out.println("Difference between "+ a + " and " + b + " = " + difference); 
		
		int product = obj.multiplication(a,b);
		System.out.println("Product of "+ a + " and " + b + " = " + product); 
		
		int quotient = obj.division(a,b);
		int remainder = obj.remainder(a,b);
		System.out.println("Dividing "+ a + " by " + b+ " results into quotient = " + quotient + " and remainder = "+ remainder ); 
				
	}

	
}
