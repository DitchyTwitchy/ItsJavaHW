package itsJava.j_collections;

import itsJava.b_oop.People.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list_0 = new ArrayList<>();
        List<String> list_1 = new ArrayList<>(20);

        for (int i = 0; i < 10; i++) {
            list_0.add("element № " + i);
        }

        System.out.println("list_0.get(0) = " + list_0.get(0));
        System.out.println("list_0.get(list_0.size() - 1) = " + list_0.get(list_0.size() - 1));

        Collections.swap(list_0, 6, 3);
        System.out.println("list_0.toString() = " + list_0.toString());
        Collections.swap(list_0, 7, 1);
        System.out.println("list_0.toString() = " + list_0.toString());

        list_1 = new ArrayList<>(list_0);
        System.out.println("list_1.toString() = " + list_1.toString());

        list_1.remove(9);
        System.out.println("list_1.toString() = " + list_1.toString());
        list_1.remove("element № 0");
        System.out.println("list_1.toString() = " + list_1.toString());
        System.out.println("list_1.contains(\"element № 7\") = " + list_1.contains("element № 7"));

        System.out.print("List: {");
        for (int i = 0; i < list_1.size(); i++){
            System.out.print("\"" + list_1.get(i) + "\"");
            if (i != list_1.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println("}");

        List<Integer> list_int = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list_int.add(i);
        }
        for (int i = 0; i < list_int.size(); i++) {
            if (list_int.get(i) != 0 && list_int.get(i) % 3 == 0) {
                System.out.print(list_int.get(i)+ " ");
            }
        }
        System.out.println("");

        int count = 0;
        for (int i : list_int) {
            if (list_int.get(i) == 5) count++;
        }
        System.out.println("count of 5s= " + count);

        for (int i = 3; i < list_int.size(); i++) {
            System.out.print(list_int.get(i)+ " ");
        }
        System.out.println("");

        for (int i = 0; i < list_int.size(); i++) {
            if (list_int.get(i) != 0 && list_int.get(i) % 3 == 0) {
                System.out.print(list_int.get(i)+ " ");
                break;
            }
        }
        System.out.println("");

        Person person_1 = new Person(true, "Hariton", 22);
        Person person_2 = new Person(false, "Helavisa", 20);
        Person person_3 = new Person(true, "Hariton", 39);

        List<Person> people = new ArrayList<>();
        people.add(person_1);
        people.add(person_2);
        people.add(person_3);

        for (Person p : people) {
            if (p.getAge() >= 18 && p.getAge() < 28 && p.isMale()) System.out.print(p.toString() + " and should serve. ");
        }
        System.out.println();
    }
}
