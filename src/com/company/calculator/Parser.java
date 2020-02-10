package com.company.calculator;

public class Parser {
    public String[] stringToArray(String input, String regex) {
       return input.split(regex);
    }
}
