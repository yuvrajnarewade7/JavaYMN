package jan21homework;

public class divideBy15 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			double temp = Math.random();
			System.out.println(temp);	
			System.out.println(15/0);	
		}catch(Throwable t) {
		
			System.out.println("Exception occured"+ t.getMessage());
			t.printStackTrace();
		}
		
		
	}

}
