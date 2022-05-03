package com.bridgelabz;

public class FindMaxValueByGenerics {
    // Given 3 Integers find the maximum
    public static void findMaxValue( Integer a, Integer b , Integer c){
        Integer max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        // Print the max number
        System.out.println("Maximum number out of 3 numbers are "+a+ ", " +b+ ", " +c+ " is :- " +max);
    }
    // Given 3 Float find the maximum
    public static void findMaxValue(Float a , Float b , Float c){
        Float max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        // Print the max number
        System.out.println("Maximum number out of 3 numbers are "+a+ "," +b+ "," +c+ " is :- " + max);
    }
    public static void main(String[] args) {
        FindMaxValueByGenerics.findMaxValue(10, 20 , 30);
        FindMaxValueByGenerics.findMaxValue(3.5f, 10.50f, 15.60f);
    }
}
