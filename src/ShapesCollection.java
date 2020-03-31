import java.util.ArrayList;
import java.util.Collection;

public class ShapesCollection implements Shapes {
	
	private Collection<Shape> ShapesList = new ArrayList<Shape>();

	public void add(Shape shape) {
		// TODO Auto-generated method stub
		if( !(shape instanceof Circle) && !(shape instanceof Rectangle) ) {
			throw new IllegalArgumentException("Unallowed Shape Type!");
		} else {
			ShapesList.add(shape);
		}
	}

	public void draw() {
		// TODO Auto-generated method stub
		for (Shape var : this.ShapesList) 
		{ 
		    var.draw();
		}
	}

}
