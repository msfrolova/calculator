package com.company.calculator;

public class Calculator {

    public static double calculate(String input) throws InputException {
        String[] parsedValues = new Parser().stringToArray(input, " ");

        if (parsedValues.length < 3) {
            throw new InputException("Wrong input: not enough values");
        }

        if (parsedValues.length > 3) {
            throw new InputException("Wrong input: too much values");
        }

        char operationChar = parsedValues[1].charAt(0);
        double firstNumber = Double.parseDouble(parsedValues[0]);
        double secondNumber = Double.parseDouble(parsedValues[2]);

        switch (operationChar) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            default:
                throw new InputException("Wrong input: operator is not supported");
        }
    }
}
