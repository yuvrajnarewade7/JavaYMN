package AccessModifer5;

import AccessModifer3.Test;

public class Sample extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test obj = new Test();
		Sample obj = new Sample();
		System.out.println(obj.defaultvar);
		System.out.println(obj.privatevar);
		System.out.println(obj.protectedvar);//through inheritance 	
		System.out.println(obj.publicvar);		
		

	
	}

}
