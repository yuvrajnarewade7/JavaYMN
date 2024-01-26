package Arrays;

public class array2D {
	
	public static void main(String[] args) {

		int[][] array2D = new int [2][3];
		
		array2D[0][0] = 1;
		array2D[0][1] = 2;
		array2D[0][2] = 3;
		
		array2D[1][0] = 4;
		array2D[1][1] = 5;
		array2D[1][2] = 6;
		
		//System.out.println(array2D[0][2]);
		//System.out.println(array2D.length);
		//System.out.println(array2D[0].length);
		
		for (int i=0; i<array2D.length; i++ ) {
			for (int j=0; j<array2D[0].length;j++) {
				
				System.out.println(array2D[i][j]);
			}
			
		
		}
	}
		
	}
