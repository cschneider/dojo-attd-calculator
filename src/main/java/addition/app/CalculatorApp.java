package addition.app;

import addition.Calculator;

public class CalculatorApp {
	
	public static void main(String[] args) {
		ConsoleUIImpl console = new ConsoleUIImpl();
		Calculator calculator = new Calculator(console);
		calculator.sum();
	}
	
}
