package com.company.calculator;

public class Calculation {

    public double calculate(String input) throws InputException {
        String[] parsedValue = new Parser().stringToArray(input, " ");

        if (parsedValue.length < 3) {
            throw new InputException("Wrong input: not enough values");
        }

        if (parsedValue.length > 3) {
            throw new InputException("Wrong input: too much values");
        }

        char operationChar = parsedValue[1].charAt(0);
        double firstNumber = Double.parseDouble(parsedValue[0]);
        double secondNumber = Double.parseDouble(parsedValue[2]);

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
