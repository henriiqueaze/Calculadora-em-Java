package exceptions;

public class NumberException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public NumberException(String msg) {
		super(msg);
	}
}
