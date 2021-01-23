package itsJava.k_myArrayList;

import java.util.ArrayList;

public class Main {
    private static Object ArrayList;

    public static void main(String[] args) {
        ArrayList = new ArrayList();

        MyArrayList arrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add("Elem " + i);
        }

        System.out.println("arrayList.toString() = " + arrayList.toString());
    }
}
