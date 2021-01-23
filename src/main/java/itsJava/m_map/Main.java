package itsJava.m_map;

import itsJava.l_set.Fruit;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Fruit pinaple = new Fruit("Ананас", 1.5);
        Fruit apple = new Fruit("Яблоко", 0.2);
        Fruit grapes = new Fruit("Виноград", 0.4);
        Fruit durian = new Fruit("Дуриан", 2.5);
        Fruit orange = new Fruit("Апельсин", 0.3);

        HashMap<String, Fruit> buyerFruit = new HashMap<>();

        buyerFruit.put("Vasya", pinaple);
        buyerFruit.put("Petya", apple);
        buyerFruit.put("Masha", grapes);
        buyerFruit.put("Akakiy", durian);
        buyerFruit.put("Natasha", orange);

        System.out.println("buyerFruit.get(\"Akakiy\") = " + buyerFruit.get("Akakiy"));

        HashMap<String, Fruit> buyerFruit_1 = new HashMap<>(buyerFruit);

        buyerFruit_1.remove("Akakiy");

        int longKeys = 0;
        int appleCount = 0;
        double totalWeight = 0;
        for (Map.Entry<String, Fruit> e : buyerFruit_1.entrySet()) {
            totalWeight += e.getValue().getWeight();
            if (e.getKey().length() > 5) longKeys++;
            if (e.getValue().getName().equals("Яблоко")) appleCount++;
            if (!e.getValue().getName().equals("Ананас") && !(e.getValue().getName().charAt(0) == 'Я')) {
                System.out.println(e.getKey() + " reserved " + e.getValue());
            }
        }
        System.out.println("Keys longer than 5 count = " + longKeys);
        System.out.println("Number of apples = " + appleCount);
        System.out.println("Average weight of fruits = " + totalWeight / buyerFruit_1.size());
    }
}
