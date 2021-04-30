package UseOfInheritanceAndExceptionPack;

public class IllegalTriangleException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String str = "";

	public IllegalTriangleException() {
		super();
	}
	
	public IllegalTriangleException(String str) throws IllegalTriangleException {
		super();
		this.str = str;
	}
	
	public String toString() {
		return str;
	}

}
