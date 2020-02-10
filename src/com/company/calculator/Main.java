package com.company.calculator;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                String userInput = Reader.read();

                if (userInput.equals("quit")) {
                    Reader.close();
                    break;
                }

                double result = new Calculation().calculate(userInput);
                System.out.println("Result: " + result);
            } catch (InputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
