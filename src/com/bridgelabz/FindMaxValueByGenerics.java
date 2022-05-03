package com.bridgelabz;

public class FindMaxValueByGenerics {
    public static void findMaxValue( Integer a, Integer b , Integer c){
        Integer max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        // Print the max number
        System.out.println("Maximum number out of 3 numbers are "+a+ "," +b+ "," +c+ " is :- " +max);
    }
    public static void main(String[] args) {
        FindMaxValueByGenerics.findMaxValue(10, 20 , 30);
    }
}
