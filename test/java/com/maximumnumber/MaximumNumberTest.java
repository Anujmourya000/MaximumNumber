package com.maximumnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * @description Class in which all the test cases are there
 *
 */
public class MaximumNumberTest {
    MaximumNumber maximum = new MaximumNumber();

    @Test
    public void given_Three_Numbers_Return_FirstNumber() {
        Integer result = maximum.maxNumber(55,23,40);
        Assertions.assertEquals(55, result);
    }

    @Test
    public void given_Three_Numbers_Return_SecondNumber() {
        Integer result = maximum.maxNumber(16,58,40);
        Assertions.assertEquals(58, result);
    }

    @Test
    public void given_Three_Numbers_Return_ThirdNumber() {
        Integer result = maximum.maxNumber(8,18,28);
        Assertions.assertEquals(28, result);
    }
}
