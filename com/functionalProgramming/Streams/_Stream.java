package com.functionalProgramming.Streams;

import java.util.List;


class Person{

    public final String name;
    public final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
}

enum Gender{
    Male,Female,Not_to_Say
}
public class _Stream {

    public static void main(String[] args) {
        List <Person> people = List.of(
                new Person("Aravind",Gender.Male),
                new Person("Aisha",Gender.Female),
                new Person("Niva",Gender.Female),
                new Person("Smith",Gender.Male),
                new Person("Ram",Gender.Male)
        );


        people.stream()
                .map(Person -> Person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);



        boolean isAllFemale = people.stream()
                .allMatch(Person -> Gender.Female.equals(Person.gender));
        System.out.println(isAllFemale);


        boolean isNoneMatch = people.stream()
                .noneMatch(Person -> Gender.Not_to_Say.equals(Person.gender));
        System.out.println(isNoneMatch);




    }
}
