package itsJava.e_interfaces_pt2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    public String name;
    public String surname;
    public int age;

    @Override
    public int compareTo(Person other) {
        if (surname.compareToIgnoreCase(other.getSurname()) != 0) {
            return surname.compareToIgnoreCase(other.getSurname());
        } else if (surname.compareToIgnoreCase(other.getName()) != 0) {
            return surname.compareToIgnoreCase(other.getName());
        } else return Integer.compare(age, other.getAge());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
