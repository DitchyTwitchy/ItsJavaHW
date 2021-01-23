package itsJava.d_interfaces_pt1;

public class Man implements Walkable, Swimable, Runnable {
    @Override
    public void run() {
        System.out.println("Man is running for up to " + MAXRUNDISTANCE + "!");
    }

    @Override
    public void swim() {
        System.out.println("Man is swimming at " + MAXSWEEMSPEED + "!");
    }

    @Override
    public void walk() {
        System.out.println("Man is walking.");
    }
}
