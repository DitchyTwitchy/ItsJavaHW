package itsJava.d_interfaces_pt1;

public class Bird implements Walkable, Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying and singing \"" + SING + "\"!");
    }

    @Override
    public void walk() {
        System.out.println("Bird is walking.");
    }
}
