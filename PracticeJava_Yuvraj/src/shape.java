


// create an interface Shape with the getArea() method. 
public interface shape {
	
	double getArea();

}

//Step 2 & 3: Implementing Shape interface with Rectangle, Circle, and Triangle classes

class Rectangle implements shape {
	
	private double length; 
	private double width;
	
	 // Step 4: Constructor for Rectangle class
	Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		
		return length* width; 
	}
}