package itsJava.d_interfaces_pt1;

public class Dog implements Walkable, Swimable, Runnable {
    @Override
    public void run() {
        System.out.println("Dog is running for up to " + MAXRUNDISTANCE + "!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming at " + MAXSWEEMSPEED + "!");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }
}
