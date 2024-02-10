package jan21homework;

public class divideBy15 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			double temp = Math.random();
			System.out.println(temp);
			int randomint = (int) (temp * 10);
			System.out.println(randomint);	
			System.out.println(15/randomint);	
		}catch(Throwable t) {
		
			System.out.println("Exception occured"+ t.getMessage());
			t.printStackTrace();
		}
		
				
	}

}
