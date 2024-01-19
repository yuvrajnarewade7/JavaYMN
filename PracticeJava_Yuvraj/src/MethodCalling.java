
public class MethodCalling {
	
	public void show1() {
		
		System.out.println("Inside Show 1"); 
	}
	
	public void show2() {
		
		System.out.println("Inside Show 2"); 
	}
	
public void show3() {
		
		System.out.println("Inside Show 3"); 
	}

//static methods can't call not static methods. 

public static void StaticMethod() {
	
	System.out.println("Inside stat method"); 
}
	
	public static void main (String[] args) {
		
		MethodCalling obj = new MethodCalling();
		obj.show1();
		obj.show2();
		obj.show3();
		StaticMethod();
	}

}
