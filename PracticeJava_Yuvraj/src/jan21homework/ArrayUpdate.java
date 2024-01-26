package jan21homework;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String colorArray[]= new String[5];
		
		colorArray[0] = "Yellow";
		colorArray[1] = "Blue";
		colorArray[2] = "Green";
		colorArray[3] = "Red";
		colorArray[4] = "Purple";
		
		//printing array elements using for loop
		System.out.println("Printing using for loop");
		for (int i=0; i < colorArray.length; i++) {
			
			System.out.println("Array Element# " + i + ": " + colorArray[i]);
		}
		
		//printing array elements using advanced for loop
		
		System.out.println("\n" + "Printing using advanced for loop");
		int j=0;
		for (String i: colorArray) {
			
			System.out.println("Array Element# "+ j + ":" + i);
			j++;
		}
		
		//printing array elements using advanced for loop
		
		//System.out.println('\n' + "Printing using Iterator class"); NEED TO DISCUSS WITH HIMANI
		
	//	Iterator <String> itr = colorArray.iterator();
		
		colorArray[4] = "Black";
		
		System.out.println('\n'+ "After array update");
		
		//printing array elements using for loop
		System.out.println("Printing using for loop");
		for (int i=0; i < colorArray.length; i++) {
			
			System.out.println("Array Element# " + i + ": " + colorArray[i]);
		}
		
		//printing array elements using advanced for loop
		
				System.out.println("\n" + "Printing using advanced for loop");
				j=0;
				for (String i: colorArray) {
					
					System.out.println("Array Element# "+ j + ":" + i);
					j++;
				}
				
	}

}
