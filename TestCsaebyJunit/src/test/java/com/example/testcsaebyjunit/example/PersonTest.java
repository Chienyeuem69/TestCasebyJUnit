package com.example.testcsaebyjunit.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test
    public static void test(){
        List<Person> people = new ArrayList<>();

        people.add(new Person("chien",22));
        people.add(new Person("hung",100));
        people.add(new Person("thieu",15));
        people.add(new Person("an",11));
        people.add(new Person("ba",200));
        people.add(new Person("canh",22));

        people.forEach((person) -> {
            System.out.println(person.getName()+" " + person.getAge());
        });

        people.sort((p1,p2) -> {
            return p1.getAge() - p2.getAge();
        }
        );

        people.forEach((person) -> {
            System.out.println(person.getName()+" " + person.getAge());
        });
    }
}
