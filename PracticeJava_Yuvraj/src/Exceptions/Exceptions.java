package Exceptions;

public class Exceptions {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Start of script");
		try {
			System.out.println(10/0);	
		}catch(Throwable t) {
		
			System.out.println("Exception occured"+ t.getMessage());
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		
		
		
		System.out.println("End of script");
		
		Thread.sleep(1000); 
		Thread.sleep(2000);
		System.out.println("FInal End of script");
		
		
	}

}
