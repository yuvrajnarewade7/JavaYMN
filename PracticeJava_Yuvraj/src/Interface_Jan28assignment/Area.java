package Interface_Jan28assignment;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double lenghtRect = 2.5; 
		double widthRect = 1.5; 
		Rectangle rectangle = new Rectangle(lenghtRect, widthRect); 
		System.out.println("Area of Rectangle: " + rectangle.getArea());
		
		// Create circle object
		double radiusCir = 2.5;
        Circle circle = new Circle(radiusCir);
        System.out.println("Area of Circle: " + circle.getArea());
		
     // Create Triangle object
        double baseTri = 2.5;
        double heightTri = 1.5;
        Triangle triangle = new Triangle(baseTri, heightTri);
        System.out.println("Area of Triangle: " + triangle.getArea());

	}

}
