package UseOfInheritanceAndExceptionPack;

public class GeometricObject {
	private String name;
	private boolean filled = false;
	private String color;

	public GeometricObject() {

	}

	public GeometricObject(String name, String color, boolean filled) {
		this.name = name;
		this.color = color;
		this.filled = filled;
	}
	
	public String toString() {
		return "Geometric Objenin ismi: " + name + "\nRengi: " + color + "\nFilled: " + filled;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
