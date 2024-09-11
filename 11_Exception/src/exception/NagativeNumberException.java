package exception;

public class NagativeNumberException extends Exception{
	public NagativeNumberException() {
		super("음수를 허용하지 않습니다.");
	}
}
