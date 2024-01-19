
public class Methods {
	
	// method declaration -> Define method
	public int add(int num1, int num2) {
		
		int sum = num1+num2; 
		
		//int sum = a+b; 
		//System.out.println(sum); 
		
		return sum; //last statement of your method
	}
	
	
public String concat(String s1, String s2 ) {
		
		String s3 = s1 + s2; 
		
		return s3; //last statement of your method
	}

public void test() {
			
		//int sum = a+b; 
	System.out.println("inside test method"); 
		
	}
	
	public static void main (String[] args) {
		
		int a;
		a=10;
		
		Methods obj = new Methods();
		obj.test();
		int addition = obj.add(5,10);
		System.out.println(addition); 
		System.out.println(obj.add(5,20)); 
		System.out.println(obj.concat("abc","def"));
		
		Math.random(); //returns double between 0.0 and 1.0 / Math class, random is a method. 
		double randomNum = Math.random(); 
		System.out.println(randomNum); 
		System.out.println(randomNum*10); 
		
				
	}

	
}
