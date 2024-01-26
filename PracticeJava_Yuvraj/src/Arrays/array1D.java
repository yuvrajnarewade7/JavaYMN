package Arrays;

public class array1D {
	
	public static void main(String[] args) {

		int array[] = new int[5];
		int[] array1 = {20, 30, 40, 8};
		
		//System.out.println(array.length);
		
		//array[0] = 10;
		//array[2] = 20;
		//array[4] = 40;
		
		for (int i=0;i<array.length;i++) {
			
			array[i]=i*5;
		}
			
		for (int i =0; i<=array.length; i++) {
			
			System.out.println(array[i]);
		}
		
	for (int i:array1) {
			
		System.out.println(i);
			
			
		}
	}
	
}
