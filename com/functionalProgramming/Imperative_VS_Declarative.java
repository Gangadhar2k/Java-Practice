package com.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class Imperative_VS_Declarative {

    public static void main(String[] args) {
        List <Person> people = List.of(
                new Person("Gangadhar",Gender.MALE),
                new Person("Aisha",Gender.FEMALE),
                new Person("Mari",Gender.MALE),
                new Person("Lara",Gender.FEMALE),
                new Person("Muthu",Gender.MALE),
                new Person("Reka",Gender.FEMALE)

        );


        //imerative Approach
        System.out.println("------------- //imerative Approach------------");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if( Gender.FEMALE.equals(person.gender) ){
                females.add(person);
            }
        }

        for (Person female: females) {
            System.out.println(female);
        }

        // Declarative Approach
        System.out.println("---------// Declarative Approach----------");
        List<Person> females2 = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender) )
                .toList();

        females2.forEach(System.out::println);


    }

    static class Person{
        private final String name;
        private final  Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
