package jan21homework;

public class secondHighestNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] array = {20, 40, 50, 10, 60};
	int temp;
	for (int i=0; i<=array.length; i++) 
		{
				
		for (int j=i+1; j<array.length; j++) 
			{
			 if (array[i] > array[j])
			 {
				 
				 temp = array[i];
				 array[i]= array[j];
				 array[j] = temp;
				 				 
			 }
			
			}
		}	
		
	System.out.println("Second largest number in the array is: " + array[array.length -2]);	
	}

}
