public class Rectangle extends AbstractShape implements Shape {
	
	private  double height, width;
	
	public Rectangle(String color, double height, double width) {
		super("Rectangle", color);
		if(height < 0 || width<0){
			throw new IllegalArgumentException("Negative Dimensions!");
		} else {
			this.setHeight(height);
			this.setWidth(width);
			this.setArea( height * width );
			this.setPerimeter( 2 * height * width);
		}
	}

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
			    " with heightXwidth: "+this.getHeight()+"X"+this.getWidth()+" And area: "+this.getArea()+" perimeter: "+this.getPerimeter());
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
