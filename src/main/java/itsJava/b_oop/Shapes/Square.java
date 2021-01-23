package itsJava.b_oop.Shapes;

import lombok.Data;

@Data
public class Square extends Rectangle {
    public Square(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
