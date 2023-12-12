package com.functionalProgramming.FunctionalInterface;

import java.util.function.Function;

public class Chaining_Function {
    public static void main(String[] args) {
        Function<String,Integer> findStringLength = str -> str.length();

        Function<Integer,Integer> multiplyByRandomNumber = num -> (int) (Math.random()*100)*num;

        Function<String,Integer> chainFunction = findStringLength.andThen(multiplyByRandomNumber);

        int UnknowNumber = chainFunction.apply("Aravind");

        System.out.println("Chaining Function::::::::"+UnknowNumber);
    }
}
