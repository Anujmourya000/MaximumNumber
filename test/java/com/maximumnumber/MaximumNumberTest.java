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

    /**
     * @description Test case  for finding for float numbers
     *
     */

    @Test
    public void given_Three_Float_Numbers_Return_first_Number() {
        Float result = maximum.maxFloatNumber(28.0f,18.60f,8.2f);
        Assertions.assertEquals(28.2f, result);
    }

    @Test
    public void given_Three_Float_Numbers_Return_Second_Number() {
        Float result = maximum.maxFloatNumber(8.0f,36.5f,28.2f);
        Assertions.assertEquals(36.5f, result);
    }

    @Test
    public void given_Three_Float_Numbers_Return_Third_Number() {
        Float result = maximum.maxFloatNumber(18.0f,28.60f,48.57f);
        Assertions.assertEquals(48.57f, result);
    }
}
