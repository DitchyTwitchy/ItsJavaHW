package itsJava.i_exceptions;

import lombok.Getter;

@Getter
public class Person {
    public String name;
    public int age;

    public Person(String name) {
        if (name.toLowerCase().trim().equals("")) throw new IncorrectUsernameException();
        this.name = name;
    }

    public void setName(String name) {
        if (name.toLowerCase().trim().equals("")) throw new IncorrectUsernameException();
        this.name = name;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 0) throw new IncorrectAgeException();
        this.age = age;
    }
}
