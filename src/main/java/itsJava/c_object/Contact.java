package itsJava.c_object;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Contact {
    String fullName;
    int age;
    String email;
    String phone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (age != contact.age) return false;
        if (!Objects.equals(fullName, contact.fullName)) return false;
        if (!Objects.equals(email, contact.email)) return false;
        return Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
