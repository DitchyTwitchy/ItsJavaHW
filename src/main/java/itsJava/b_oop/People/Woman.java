package itsJava.b_oop.People;

public class Woman extends Person {
    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
        this.isMale = false;
    }

    @Override
    public void printAge() {
        System.out.println("Always 18!");
    }

    @Override
    public String toString() {
        return name + " is a " + age + " year old woman.";
    }
}
