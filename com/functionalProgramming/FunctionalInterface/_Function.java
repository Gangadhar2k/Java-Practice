package com.functionalProgramming.FunctionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Normal Approach
        int increasedNumber = incrementByOne(2);
        System.out.println("Normal method:::::"+increasedNumber);       //Normal method:::::2

        // Functional InterFace
        Function<Integer,Integer> incrementByOneFunctionalApproach = number -> number+1;
        int functionalApproach = incrementByOneFunctionalApproach.apply(1);
        System.out.println("Functional Interface::::::::"+functionalApproach);      //Functional Interface::::::::2

        Function<String,Integer> FindStringLength = str-> str.length();
        int stringLength = FindStringLength.apply("Gangadhar");
        System.out.println("String Length :::::::"+stringLength);           //String Length :::::::9
    }
    static int incrementByOne(int number){
        return number+1;
    }
}
