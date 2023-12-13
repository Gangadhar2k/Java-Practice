package com.functionalProgramming.FunctionalInterface;

import java.util.function.Predicate;

public class _predicate {

    public static void main(String[] args) {

        Predicate<String> isValidMail = mail ->{
            return mail.contains("@gmail.com");

        };

        String mail_id = "abcd@gmail.com";
        System.out.println("Predicate Function:::::::::"+isValidMail.test(mail_id));


        //Predicate Chaining

        Predicate<String> isValidLength = mail ->{
         return mail.length() > 22;
        };

        String Chain_test = "abcdefghijklmn@gmail.com";

        // Instead of using And we can also use or based on Logics
        boolean predicateChaining = isValidLength.and(isValidMail)
                        .test(Chain_test);
        System.out.println("Predicate Chaining:::::::"+predicateChaining);
    }
}
