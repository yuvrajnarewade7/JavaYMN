package Loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0;i<=10;i++) {
			System.out.println("i = " + i);
			
			for (int j=0;j<=i;j++) {
				System.out.println("inside j");
				
			
				
				for (int k=0;k<=j;k++) {
					
					System.out.println("inside k");
					
				}
			}
	
		}
		System.out.println("after while loop");	
		
			}
	
}
