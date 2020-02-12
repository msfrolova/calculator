package com.company.test;

import com.company.calculator.Parser;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class ParserTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void pass_whenAddsValueIntoArray() {

        Parser parser = new Parser();

        String[] expectedArray = {"1", "+", "1"};
        String[] resultArray = parser.stringToArray("1 + 1", " ");

        assertArrayEquals(expectedArray, resultArray);
    }

}
