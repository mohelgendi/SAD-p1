
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Shape myShapeOne  = new Circle("blue", 2.35);
			Shape myShapeTwo  = new Rectangle("red", 3, 5);
			
			ShapesCollection MyCollection = new ShapesCollection();
			
			MyCollection.add(myShapeOne);
			MyCollection.add(myShapeTwo);
			MyCollection.draw();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
