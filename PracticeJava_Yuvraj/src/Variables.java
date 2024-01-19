
public class Variables {
	
	public static void main (String[] args) {
		//declaration
		int i=1034567890; //integer/ Initializating the. max 10 digits  
		long l= 464444465456478787l; //long integer
		float f = 5.6f; //decimal
		double d = 5.66666666; // long decimal
		boolean b = true; //true or false
		char c = 'h'; //single character 
		
		String str1 = "him"; 
		String name;
		name = "John"; 
		String name2 = new String(); 
		name2 = "Mark";
		
		String addressPune; 
		String addressPuneViaMumbai; 
		
		String s1 = "Hey ";
		String s2= "Its ";
		String s3 = "Sunday";
		
		String s4 = s1+s2+s3; //string conctentaion 
		System.out.println(s4);
		System.out.println(s1+s2+s3);
		System.out.println(s1+s2+s3+" Hello its me");
		
		int num1 = 10;
		int num2 = 20;
		int num3 = num1+num2;
		System.out.println(num3);
		System.out.println(num1+num2);
		System.out.println(num1+num2+s1);
		System.out.println(s2+num1+num2+s1);
		System.out.println(s2+(num1+num2)+s1);
		
		//12 + 40 Operands 
		//unary operations -> +
		//binary operators -> ++, --  
		//Ternary operators -> +++
		
		//Equality and relational ==, !=, <, > <=, >=
		System.out.println(30!=30);
		
		System.out.println((30>20) && (30<40));
		System.out.println((30<20) || (30<40));
		
		boolean con = !true;
		System.out.println(con);
		
		System.out.println(true && true);
		
		byte b1 = 011;  
	}

}
