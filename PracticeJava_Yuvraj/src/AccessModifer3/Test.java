package AccessModifer3;

 public class Test { //default class type if not defined

	 public int publicvar;
	 private int privatevar;
	 protected int protectedvar;
	 int defaultvar;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj = new Test();
		System.out.println(obj.defaultvar);
		System.out.println(obj.privatevar);
		System.out.println(obj.protectedvar);	
		System.out.println(obj.publicvar);		
		

	}

}
