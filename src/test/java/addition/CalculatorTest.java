package addition;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import addition.Calculator;
import addition.ConsoleUI;

public class CalculatorTest {
	
	@Captor
	ArgumentCaptor<Integer> result;
	
	@Mock
	ConsoleUI consoleUI;
	
	@InjectMocks
	Calculator calculator;
	
	@Before
	public void before() {
		initMocks(this);
	}

	@Test
	public void test2plus3() {
		when(consoleUI.askForNumber()).thenReturn(2, 3);

		calculator.sum();
		
		verify(consoleUI).printResult(result.capture());
		assertThat(result.getValue(), is(5));
	}
	
	@Test
	public void test3plus3() {
		when(consoleUI.askForNumber()).thenReturn(3, 3);

		calculator.sum();
		
		verify(consoleUI).printResult(result.capture());
		assertThat(result.getValue(), is(6));
	}

}
