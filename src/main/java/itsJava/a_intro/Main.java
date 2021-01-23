package itsJava.a_intro;

public class Main {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.setStringParam("test");
        System.out.println("test.getStringParam() = " + test.getStringParam());
    }
}
