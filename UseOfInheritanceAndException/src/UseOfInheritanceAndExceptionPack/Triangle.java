package UseOfInheritanceAndExceptionPack;

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;

	public Triangle(String name, String color, boolean filled, double side1, double side2, double side3) 
	throws IllegalTriangleException{
		super();
		if (side1 + side2 < side3 
				|| side1 + side3 < side2
				|| side2 + side3 < side1) {
			throw new IllegalTriangleException("Ucgenin her iki kenarýnýn toplami diger kenardan buyuk olmalý");
		}
		super.setName(name);
		super.setColor(color);
		super.setFilled(filled);
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}
	
	public double getArea() {
		return Math.sqrt(Math.abs(u() * (u() - side1) * (u() - side2) * (u() - side3)));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return super.toString() + "\nSide1: " + side1 + "\nSide2: "+ side2 + "\nSide3: " + side3;
	}

	public double u() {
		return (side1 + side2 + side3) / 2.0;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
}
