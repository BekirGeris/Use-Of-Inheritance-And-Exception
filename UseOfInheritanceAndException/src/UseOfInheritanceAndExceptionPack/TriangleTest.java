package UseOfInheritanceAndExceptionPack;

public class TriangleTest {
	public static void main(String[] args) {
		
		Triangle triangle1;
		
		try {
			triangle1 = new Triangle("ucgen", "mavi", true, 10, 20, 15);
			
			System.out.println(triangle1.toString());
			
			System.out.printf(triangle1.getName() + " alani: %6.2f\n", triangle1.getArea());
			
			System.out.println(triangle1.getName() + " cevresi: " + triangle1.getPerimeter());
		
		} catch (IllegalTriangleException e) {
			e.printStackTrace();
		}

	}
}
