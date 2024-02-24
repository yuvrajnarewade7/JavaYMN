package feb24Assigments;

import java.util.ArrayList;

public class duplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = new String [] {"Jon", "Mike","Simba","Micky", "Jon", "Jay", "Simba"};
		int arrayLength = strArray.length; 
		ArrayList<String> duplicates = new ArrayList<String>(); //created ArrayList object to store duplicates identified from the array. 
		for (int i=0; i<=arrayLength; i++) {					//ArrayList is resizable array
			
			for (int j=i+1; j<arrayLength; j++) {
				if (strArray[i] == strArray[j]) {
					duplicates.add(strArray[i]);  
 				}
							
			}
					
		}
		
		System.out.println("Duplicate elements in the array are:"+ duplicates);
		
	}

}
