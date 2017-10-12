
public class IncorrectInputException extends Exception {
	private String incorrectInput;
	public IncorrectInputException (String userInput) {
		this.incorrectInput = userInput;
	}
	public String getIncorrectInput() {
		return incorrectInput;
	}
}
