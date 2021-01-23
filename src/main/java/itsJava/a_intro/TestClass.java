package itsJava.a_intro;

public class TestClass {
    private int intParam;
    private double doubleParam;
    private String stringParam;

    public TestClass() {
    }

    public TestClass(String stringParam) {
        this.stringParam = stringParam;
    }

    public TestClass(int intParam, double doubleParam, String stringParam) {
        this.intParam = intParam;
        this.doubleParam = doubleParam;
        this.stringParam = stringParam;
    }

    public TestClass(int intParam, double doubleParam) {
        this.intParam = intParam;
        this.doubleParam = doubleParam;
    }

    public TestClass(double doubleParam, String stringParam) {
        this.doubleParam = doubleParam;
        this.stringParam = stringParam;
    }

    public int getIntParam() {
        return intParam;
    }

    public void setIntParam(int intParam) {
        this.intParam = intParam;
    }

    public double getDoubleParam() {
        return doubleParam;
    }

    public void setDoubleParam(double doubleParam) {
        this.doubleParam = doubleParam;
    }

    public String getStringParam() {
        return stringParam;
    }

    public void setStringParam(String stringParam) {
        this.stringParam = stringParam;
    }
}
