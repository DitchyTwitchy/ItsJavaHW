package itsJava.h_enums;

public enum Weekdays {
    MONDAY("ПОНЕДЕЛЬНИК"),
    TUESDAY("ВТОРНИК"),
    WEDNESDAY("СРЕДА"),
    THURSDAY("ЧЕТВЕРГ"),
    FRIDAY("ПЯТНИЦА"),
    SATURDAY("СУББОТА"),
    SUNDAY("ВОСКРЕСЕНЬЕ");

    private final String translation_rus;

    Weekdays(String translation_rus) {
        this.translation_rus = translation_rus;
    }

    @Override
    public String toString() {
        return this.name() + " : " + translation_rus;
    }
}
