
public abstract class AbstractShape {
	private String type;
	
	private String color;
	
	public AbstractShape(String type, String color) {
		this.type = type;
		this.color = color;
	}


	private double area;
	
	private double perimeter;
	
	public double getCalculatedArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getCalculatedPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public String getColor() {
		return color;
	}

	
	public void setColor(String color) {
		this.color = color;
	}

}
