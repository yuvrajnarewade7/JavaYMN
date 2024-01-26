package Loops;

public class BreaknCont {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =0;i<=10;i++) {
			
			//if (i==6) {break will terminate the entire loop on a condition
				//break;	//			
			//}
			
			if (i==5 || i==9){
				
				continue;//continue is used to skip particular condition. 
			}
			System.out.println(i);
		}
			
			

	}

}
