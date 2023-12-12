package com.functionalProgramming.FunctionalInterface;

import java.util.function.BiFunction;

public class _BiFunction {

    public static void main(String[] args) {

        BiFunction<String[],Integer,Integer> unknownNumber = (name,number)->{
            int random = name[(int) (Math.random() * 4)].length() ;
            return random*number;
        };
        String[] name = {"Aravind","Lisa","Jack","Rio"};
        Integer GetUnknownNumber = unknownNumber.apply(name, 5);
        System.out.println("BiFunciton::::::::::"+GetUnknownNumber);
    }
}
