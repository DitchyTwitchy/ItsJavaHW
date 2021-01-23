package itsJava.g_tests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Telephone {
    private final String phoneNumber;
    private final String brand;
    private double price;
}
