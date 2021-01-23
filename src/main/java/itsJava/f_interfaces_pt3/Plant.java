package itsJava.f_interfaces_pt3;

public class Plant implements Eatable, Talkable {
    @Override
    public void eatable() {
        System.out.println("Plant absorbs some water.");
    }

    @Override
    public void talk() {
        System.out.println("Plant rustles in the wind.");
    }
}
