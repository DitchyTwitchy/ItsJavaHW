package itsJava.b_oop.People;

public class Man extends Person {
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
        this.isMale = true;
    }

    @Override
    public String toString() {
        return name + " is a " + age + " year old male.";
    }
}
