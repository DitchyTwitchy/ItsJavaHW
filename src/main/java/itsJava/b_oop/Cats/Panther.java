package itsJava.b_oop.Cats;

public class Panther extends Cat {
    @Override
    public void sayMeow() {
        System.out.println("Rrrrrr meow!");
    }

    @Override
    public String toString() {
        return "This is panther - big black cat.";
    }
}
