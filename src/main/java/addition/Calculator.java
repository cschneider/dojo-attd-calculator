package addition;

public class Calculator {

	private ConsoleUI console;

	public Calculator(ConsoleUI console) {
		this.console = console;
	}

	public void sum() {
		int a = console.askForNumber();
		int b = console.askForNumber();
		console.printResult(a + b);
	}

}
