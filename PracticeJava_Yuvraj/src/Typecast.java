
public class Typecast {

		public static void main (String[] args) {
			
			int randomNum = (int) (Math.random()*100); 
			System.out.println(randomNum); 
			
			String rollNo = "23"; 
			System.out.println(rollNo+5);
			int rollNoInt = Integer.parseInt(rollNo); 
			System.out.println(rollNoInt+5);
		}
}
