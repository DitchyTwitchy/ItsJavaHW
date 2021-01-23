package itsJava.c_object;

import itsJava.b_oop.Cats.Cat;
import itsJava.b_oop.Cats.Panther;
import itsJava.b_oop.People.Person;
import itsJava.b_oop.Shapes.Triangle;

public class MainObject {
    public static void main(String[] args) {
        Person person = new Person(true, "Vasya", 30);
        System.out.println("person.ToString() = " + person.toString());

        Panther panther = new Panther();
        System.out.println("panther.toString() = " + panther.toString());

//        Narrowing is ok
        Cat pantherCat = new Panther();
        System.out.println("pantherCat.toString() = " + pantherCat.toString());

//        Panther catPanther = new Cat(); - widening is not ok

        Triangle triangle = new Triangle((double) 12, (int) 14.0, 10);
        System.out.println("triangle.toString() = " + (String) triangle.toString());

        System.out.println("=====================");

        Contact contact1 = new Contact("Vasya", 15, "vasya@gmail.com", "+79119660945");
        Contact contact2 = new Contact("Vasya_2", 19, "vasya@gmail.com", "+79119660945");

        System.out.println("contact1.hashCode() = " + contact1.hashCode());
        System.out.println("contact2.hashCode() = " + contact2.hashCode());
        System.out.println("contact1.hashCode() == contact2.hashCode() = " + (contact1.hashCode() == contact2.hashCode()));
        System.out.println("contact1.equals(contact2) = " + contact1.equals(contact2));
    }
}
