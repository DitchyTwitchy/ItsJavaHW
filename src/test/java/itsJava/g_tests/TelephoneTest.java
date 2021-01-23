package itsJava.g_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TODO: test getters and setters using PropertyAssert
@DisplayName("Class Telephone must: ")
public class TelephoneTest {

    public static final String DEFAULT_NUMBER = "9052012856";
    public static final String DEFAULT_BRAND = "iPhone";
    public static final double DEFAULT_PRICE = 10000.0;
    public static final String DEFAULT_TOSTRING = "Telephone(phoneNumber=9052012856, brand=iPhone, price=10000.0)";

    @Test
    @DisplayName("have correct all fields constructor")
    public void shouldHaveCorrectAllConstructor() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);

        Assertions.assertAll("telephone all constructor",
                () -> assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BRAND, telephone.getBrand()),
                () -> assertEquals(DEFAULT_PRICE, telephone.getPrice())
        );
    }

    @Test
    @DisplayName("have correct required fields constructor")
    public void shouldHaveCorrectRequiredConstructor() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND);

        Assertions.assertAll("telephone required constructor",
                () -> assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BRAND, telephone.getBrand())
        );
    }

    @Test
    @DisplayName("have correctly working setters")
    public void shouldHaveCorrectSetter() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND);
        telephone.setPrice(DEFAULT_PRICE);
        assertEquals(DEFAULT_PRICE, telephone.getPrice());
    }

    @Test
    @DisplayName("have correctly working getters")
    public void shouldHaveCorrectGetters() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        Assertions.assertAll("telephone getters",
                () -> assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BRAND, telephone.getBrand()),
                () -> assertEquals(DEFAULT_PRICE, telephone.getPrice())
        );
    }

    @Test
    @DisplayName("have correctly overriden toString")
    public void shouldHaveCorrectToString() {
        var telephone = new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
        assertEquals(DEFAULT_TOSTRING, telephone.toString());
    }


}
