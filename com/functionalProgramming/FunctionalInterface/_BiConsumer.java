package com.functionalProgramming.FunctionalInterface;

import java.util.function.BiConsumer;

class  studentOne{
    public String name;
    public int totalmark;

    public studentOne(String name, int totalmark) {
        this.name = name;
        this.totalmark = totalmark;
    }
}


public class _BiConsumer {

    public static void main(String[] args) {
        BiConsumer<studentOne,studentOne> comapareMarks = (one,two)->{
            System.out.println( one.totalmark > two.totalmark ? one.name+" is high" : two.name+" is high");
        };

        var studentOne = new studentOne("Aravind",80);
        var studenttwo = new studentOne("Aisha",79);

        comapareMarks.accept(studentOne,studenttwo);


    }
}
