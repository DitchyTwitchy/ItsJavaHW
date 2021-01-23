package itsJava.f_interfaces_pt3;

public class Man implements Eatable, Talkable {
    @Override
    public void eatable() {
        System.out.println("Man om-nom-noms some junk food.");
    }

    @Override
    public void talk() {
        System.out.println("Man says Black Lives Matter!");
    }
}
