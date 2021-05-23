package com.maximumnumber;
/**
 * @description Class in which all the test methods are written
 *
 */
public class MaximumNumber {
    /**
     * @description Methods to find out the maximum number among the three integer
     *
     */
    public Integer maxNumber(Integer x, Integer y, Integer z) {
        Integer maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Test Maximum of Three Variables");
    }
}
