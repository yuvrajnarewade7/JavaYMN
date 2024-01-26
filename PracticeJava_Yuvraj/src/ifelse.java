
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)(Math.random()*10);
		System.out.println(num);
		
		if (num>5) {
			
			System.out.println("greater than 5");
			System.out.println("still greater than 5");
		}
		else if (num <3)
			System.out.println("less than 3");
		else
			System.out.println("less than 5");
			
		
	}

}
