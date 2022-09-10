package ca.javafunblog.basics;

import java.util.Arrays;

public class FunOnDaySeven {


    // Write multiplication method for two numbers
    // for different types - try using method overloading
    // int, double

    public static void main(String[] args) {
//        forEachDemo();
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1, 2, 3, 4, 5));
    }

    public static void forEachDemo() {
        int[] array = array(10);
        // syntax for(type variableName : arrayName){}
        // for each -> it was added in java 1.5
        // enhanced for
        // Iterator
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static int[] array(int length) {
        int[] array = new int[length];

        // traditional for
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }

        return array;
    }


    // In java, you cannot return multiple values from anything
    // var args
    // variable arguments
    public static int add(int... params) {
        // int...
        // var args is almost like an array
        int result = 0;
        for (int i : params) {
            result = result + i;
            // result += i; -> short hand notation
        }

        return result;
    }




}
