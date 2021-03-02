package io.quind.calculatorbasic;

import io.quind.calculatorbasic.domain.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorbasicApplicationTests {

	@Test
	void contextLoads() {
		int number1 = 5;
		int number2 = 8;
		int prediction = 13;
		int result;
		Calculator instanceTest = new Calculator();

		//Act
		result = instanceTest.addTwoNumbers(number1, number2);

		//Assert
		assertEquals(result, prediction);

	}

}
