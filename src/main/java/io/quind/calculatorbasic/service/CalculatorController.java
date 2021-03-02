package io.quind.calculatorbasic.service;
import io.quind.calculatorbasic.domain.Calculator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestController

public class CalculatorController {
    @RequestMapping("/add")
    public static int getUrladdition(
            @RequestParam(value="number1", defaultValue = "0")int number1,
            @RequestParam(value="number2", defaultValue = "0")int number2){
            Calculator instanceCalculator = new Calculator();
            return instanceCalculator.addTwoNumbers(number1, number2);
    }
}
