public class Circle extends AbstractShape implements Shape {
	
	public Circle(String color, double radius) {
		super("Circle", color);
		if(radius < 0){
			throw new IllegalArgumentException("Negative Dimensions!");
		} else {
			this.setRadius(radius);
			this.setArea( 3.1415 * radius * radius );
			this.setPerimeter( 2 * 3.1415 * radius);
		}
	}

	private double radius;

	public double getArea() {
		// TODO Auto-generated method stub
		return this.getCalculatedArea();
	}

	public double getPerimeter() {
		// TODO Auto-generated method stub
		return this.getCalculatedPerimeter();
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This's a: "+this.getType()+" colored: "+this.getColor()+
	    " with radius: "+this.radius+" and area: "+this.getArea()+" perimeter: "+this.getPerimeter());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
