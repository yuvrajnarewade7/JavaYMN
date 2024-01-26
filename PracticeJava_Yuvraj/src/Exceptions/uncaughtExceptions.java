package Exceptions;

public class uncaughtExceptions {

	public void exception() throws Exception {
		
		System.out.println("inside exception");
		throw new Exception ("My designed exception has occured");
		
	}
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		uncaughtExceptions obj = new uncaughtExceptions();
		obj.exception();
		//throw new Exception ("My designed exception has occured");
		

	}

}
