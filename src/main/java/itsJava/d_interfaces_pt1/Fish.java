package itsJava.d_interfaces_pt1;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming as fast as man and dog for some reason, at " + MAXSWEEMSPEED + ".");
    }
}
