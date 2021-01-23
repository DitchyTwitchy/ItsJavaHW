package itsJava.b_oop.Shapes;

import lombok.Data;

@Data
public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public boolean equals(Rectangle other) {
        return getPerimeter() == other.getPerimeter();
    }
}
