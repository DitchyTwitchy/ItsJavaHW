package itsJava.b_oop;

import itsJava.b_oop.Cats.Cat;
import itsJava.b_oop.Cats.Panther;
import itsJava.b_oop.People.Man;
import itsJava.b_oop.People.Person;
import itsJava.b_oop.People.Woman;
import itsJava.b_oop.Shapes.Circle;
import itsJava.b_oop.Shapes.Rectangle;
import itsJava.b_oop.Shapes.Square;
import itsJava.b_oop.Shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        //Cats
        Cat cat = new Cat();
        cat.sayMeow();

        Panther panther = new Panther();
        panther.sayMeow();

        System.out.println("=======================");

        //People
        Person oldBeardyDude = new Man("This guy", 999);
        Person adam = new Man("Adam", 29);
        Person lilith = new Woman("Lilith", 25);
        Person eve = new Woman("Eve", 19);

        Person[] people = new Person[]{oldBeardyDude, adam, lilith, eve};

        for (Person p : people) {
            p.printAge();
        }

        System.out.println("=======================");

        //Shapes
        Rectangle rectangle = new Rectangle(4, 10);
        System.out.println("rectangle.getArea() = " + rectangle.getArea());
        System.out.println("rectangle.getPerimeter() = " + rectangle.getPerimeter());

        Square square = new Square(6);
        System.out.println("square.getArea() = " + square.getArea());
        System.out.println("square.getPerimeter() = " + square.getPerimeter());

        Triangle triangle = new Triangle(10, 5, 12);
        System.out.println("triangle.getArea() = " + triangle.getArea());
        triangle.getPerimeter();

        Circle circle = new Circle(12);
        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle.getPerimeter() = " + circle.getPerimeter());
    }
}
