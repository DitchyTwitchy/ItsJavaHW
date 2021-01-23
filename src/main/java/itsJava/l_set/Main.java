package itsJava.l_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 0.2);
        Fruit orange = new Fruit("Orange", 0.15);
        Fruit durian = new Fruit("Durian", 1.2);

        Set<Fruit> fruits = new HashSet<>(Arrays.asList(apple, orange, durian, apple));
        System.out.println("fruits = " + fruits);

        fruits.remove(apple);
        System.out.println("fruits = " + fruits);

        for (Fruit f : fruits) {
            System.out.println("f.getName() = " + f.getName());
        }
    }
}
