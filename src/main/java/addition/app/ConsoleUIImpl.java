package addition.app;

import java.io.PrintStream;
import java.util.Scanner;

import addition.ConsoleUI;

public class ConsoleUIImpl implements ConsoleUI {

	final private Scanner in;
	private PrintStream out;

	public ConsoleUIImpl() {
		this.in = new Scanner(System.in);
		this.out = System.out;
	}
	
	@Override
	public int askForNumber() {
		out.print("Type number: ");
		return in.nextInt();
	}

	@Override
	public void printResult(int result) {
		out.printf("Result: %d", result);
	}

}
