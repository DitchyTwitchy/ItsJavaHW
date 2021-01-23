package itsJava.b_oop.People;

import lombok.Data;

@Data
public class Person {
    boolean isMale;
    String name;
    int age;

    public Person() {
    }

    public Person(boolean isMale, String name, int age) {
        this.isMale = isMale;
        this.name = name;
        this.age = age;
    }

    public void printAge() {
        System.out.println(age);
    }

    @Override
    public String toString() {
        return name + " is a " + age + " year old " + (isMale ? "male" : "female");
    }
}
