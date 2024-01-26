package Exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			//Db connection
			//executes DB queries
			//validating some data
			//Closing DB connection
			System.out.println("Inside try block");
			System.out.println(10/0);
		}catch (Exception e ){
			System.out.println("Exception occured");
			
		} finally {
			
			//close DB connection
			System.out.println("Closed connection");
		}
		
		
		
	}

}
