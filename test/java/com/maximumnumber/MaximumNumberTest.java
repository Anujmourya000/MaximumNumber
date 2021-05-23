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
        Integer result = maximum.maxNumber(15,23,40);
        Assertions.assertEquals(40, result);
    }
}
