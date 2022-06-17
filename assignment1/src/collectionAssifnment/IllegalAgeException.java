package collectionAssifnment;

public class IllegalAgeException extends Exception {
public IllegalAgeException(String message) {
	super(message);
}

public IllegalAgeException() {
	super("you are not allowed cz of less age");
}
}
