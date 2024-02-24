package Interface_Jan28assignment;


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

class Circle implements shape {
	
	private double radius;
	
	Circle(double radius) {
		this.radius = radius;
		
	}
	
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
}

class Triangle implements shape {
	
	private double base;
	private double height; 
	
	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5*base*height;
		}

}
	