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
    public static double getUrladdition(
            @RequestParam(value="number1", defaultValue = "0")double number1,
            @RequestParam(value="number2", defaultValue = "0")double number2){
            Calculator instanceCalculator = new Calculator();
            return instanceCalculator.addTwoNumbers(number1, number2);
    }
    @RequestMapping("/sub")
    public static double getUrlsubtraction(
            @RequestParam(value="number1", defaultValue="0")double number1,
            @RequestParam(value="number2", defaultValue="0")double number2){
            Calculator instanceCalculator = new Calculator();
            return instanceCalculator.subtractTwoNumbers(number1, number2);
    }

    @RequestMapping("/mult")
    public static double getUrlmultiplication(
            @RequestParam(value="number1", defaultValue="0")double number1,
            @RequestParam(value="number2", defaultValue="0")double number2){
        Calculator instanceCalculator = new Calculator();
        return instanceCalculator.multiplicationTwoNumbers(number1, number2);
    }

    @RequestMapping("/div")
    public static String getUrldivision(
            @RequestParam(value="number1", defaultValue="0")double number1,
            @RequestParam(value="number2", defaultValue="0")double number2){
        Calculator instanceCalculator = new Calculator();
        if (number2 == 0) {
            return "Error, verificar los datos de entrada.";
        } else{
          return String.valueOf((instanceCalculator.divisionTwoNumbers(number1, number2)));
        }
    }
}