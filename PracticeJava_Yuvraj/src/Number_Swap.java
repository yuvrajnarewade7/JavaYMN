
public class Number_Swap {
	
	public void swap(int num1, int num2) {
		
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swap: First Number = "+ num1 + " Second Number = " + num2);
				
	}
	
public static void main (String[] args) {
		
		int first_num = 19;
		int second_num = 5;
		System.out.println("Before Swap: First Number = "+ first_num + " Second Number = " + second_num);
		Number_Swap obj = new Number_Swap();
		obj.swap(first_num, second_num);
					
	}
	
}
