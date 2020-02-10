package com.company.test;

import static org.junit.Assert.assertEquals;

import com.company.calculator.Calculation;
import com.company.calculator.InputException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculationTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void fails_whenLessThanThreeValuesProvided() throws InputException {
        expectedException.expect(InputException.class);
        expectedException.expectMessage("Wrong input: not enough values");

        new Calculation().calculate("");
    }

    @Test
    public void fails_whenMoreThanThreeValuesProvided() throws InputException {
        expectedException.expect(InputException.class);
        expectedException.expectMessage("Wrong input: too much values");

        new Calculation().calculate("1 1 1 1");
    }

    @Test
    public void fails_whenOperatorIsNotSupported() throws InputException {
        expectedException.expect(InputException.class);
        expectedException.expectMessage("Wrong input: operator is not supported");

        new Calculation().calculate("1 # 1");
    }

    @Test
    public void returnAddition_whenAdditionSelected() throws InputException {
        assertEquals(2, new Calculation().calculate("1 + 1"), 0);
    }

    @Test
    public void returnSubtraction_whenSubtractionSelected() throws InputException {
        assertEquals(5, new Calculation().calculate("15 - 10"), 0);
    }

    @Test
    public void returnMultiplication_whenMultiplicationSelected() throws InputException {
        assertEquals(4, new Calculation().calculate("2 * 2"), 0);
    }

    @Test
    public void returnDivision_whenDivisionSelected() throws InputException {
        assertEquals(5, new Calculation().calculate("20 / 4"), 0);
    }
}
