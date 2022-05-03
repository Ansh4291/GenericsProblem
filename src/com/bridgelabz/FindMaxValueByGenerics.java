package com.bridgelabz;

public class FindMaxValueByGenerics <E extends Comparable<E>> {
    E a1 , a2, a3 , a4 , a5 ;
    public FindMaxValueByGenerics (E a1, E a2, E a3 , E a4 , E a5){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }

    /*
      Generic method to compare any type of data and find maximum
     a1 : First value to compare
     a2 : Second value to compare
     a3 : Third value to compare
     max : Maximum of three values
     */
    public static <E extends Comparable<E>> E findMaxValue(E a1, E a2, E a3, E a4 , E a5 ) {

        E max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        if (a4.compareTo(max) > 0)
            max = a4;
        if (a5.compareTo(max) > 0)
            max = a5;

        return max;
    }

        public static void main (String[]args){
            System.out.println("Welcome to Find Maximum Problem Using Generics.");
            System.out.println("The maximum value between the 3 Integer are :- " +findMaxValue(10,20,30,40,50));
            System.out.println("The maximum value between the 3 Floats are:- " +findMaxValue(3.5f, 10.50f, 15.60f, 45.60f , 80.43f));
            System.out.println("The maximum value between the 3 Strings are:- " +findMaxValue("Smith", "Jhon", " rock" , "Anshul", "Deepesh"));
        }

}
