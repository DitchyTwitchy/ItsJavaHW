package itsJava.f_interfaces_pt3;

public class Cow implements Talkable, Eatable {

    @Override
    public void eatable() {
        System.out.println("Cow om-nom-nons some grass.");
    }

    @Override
    public void talk() {
        System.out.println("Cow says Moooooo.");
    }
}
