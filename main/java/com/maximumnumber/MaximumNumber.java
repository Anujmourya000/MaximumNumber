package com.maximumnumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @description Class in which all the test methods are written
 *
 */
public class MaximumNumber<E extends Comparable<E>> {
    E first, second, third;

    public MaximumNumber() {
        this.first = first;
        this.second= second;
        this.third = third;
    }

    public E testMaximum(){
        return testMaximum(first, second, third);
    }

    public static <E extends Comparable<E>> E testMaximum(E first, E second, E third){
        E maxvalue = first;
        if(second.compareTo(maxvalue)>0){
            maxvalue = second;
        }
        if(third.compareTo(maxvalue)>0){
            maxvalue = third;
        }
        return maxvalue;
    }

    public static <E extends Comparable<E>> E testMaximumAll(E... args) {
        List<E> list = Arrays.asList(args);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
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

    /**
     * @description Methods to find out the maximum number among the three float
     *
     */
    public Float maxFloatNumber(Float x, Float y, Float z) {
        Float maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        return maximum;
    }

    /**
     * @description Methods to find out the maximum Values among the three Strings
     *
     */
    public String maxStringValue(String x, String y, String z) {
        String maximum = x;
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
