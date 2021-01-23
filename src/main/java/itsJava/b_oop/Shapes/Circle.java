package itsJava.b_oop.Shapes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle extends Shape {
    public double radius;

    @Override
    public double getArea() {
        return PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
