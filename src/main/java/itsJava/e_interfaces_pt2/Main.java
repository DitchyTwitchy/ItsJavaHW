package itsJava.e_interfaces_pt2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Vasya", "Pupkin", 31);
        Person person2 = new Person("Masha", "Abramova", 12);
        Person person3 = new Person("Vasya", "Pupkin", 29);

        Person[] people = {person1, person2, person3};

        System.out.println("Before: Arrays.toString(people) = " + Arrays.toString(people));
        Arrays.sort(people);
        System.out.println("After: Arrays.toString(people) = " + Arrays.toString(people));

        System.out.println("person2.clone() = " + person2.clone());
    }
}
