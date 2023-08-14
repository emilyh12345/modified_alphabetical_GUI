public class IllegalWordException extends IllegalArgumentException { //extend existing exception to create class for illegalwordexception
	public IllegalWordException(String s) { //a constructor that takes in a string and calls super to pass the string along
		super(s);
	}
}
