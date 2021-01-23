package itsJava.k_myArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Class MyArrayList must: ")
public class MyArrayListTest {
    public static final String DEFAULT_MID_ELEMENT = "Elem 5";
    public static final int DEFAULT_MID_INDEX = 5;

    @Test
    @DisplayName("return size correctly")
    public void mustReturnSizeCorrectly() {
        MyArrayList list = createDefaultList();
        assertEquals(10, list.size());
    }

    @Test
    @DisplayName("tell if list is empty")
    public void mustTellIfListIsEmpty() {
        MyArrayList list_0 = new MyArrayList();
        MyArrayList list_1 = createDefaultList();

        Assertions.assertAll("list isEmpty",
                () -> assertTrue(list_0.isEmpty()),
                () -> assertFalse(list_1.isEmpty())
        );
    }

    @Test
    @DisplayName("tell if list contains an element")
    public void mustTellIfListContainsElement() {
        MyArrayList list_0 = new MyArrayList();
        MyArrayList list_1 = createDefaultList();

        Assertions.assertAll("testing contains",
                () -> assertFalse(list_0.contains(DEFAULT_MID_ELEMENT)),
                () -> assertTrue(list_1.contains(DEFAULT_MID_ELEMENT))
        );
    }

    @Test
    @DisplayName("add element correctly")
    public void mustCorrectlyAddElement() {
        MyArrayList list = createDefaultList();
        int sizeBeforeAdd = list.size();

        list.add(DEFAULT_MID_ELEMENT);

        assertEquals(sizeBeforeAdd + 1, list.size());
    }

    @Test
    @DisplayName("remove element correctly")
    public void mustCorrectlyRemoveElement() {
        MyArrayList list = createDefaultList();

        int sizeBeforeRemove = list.size();
        boolean isRemoved = list.remove(DEFAULT_MID_ELEMENT);

        assertEquals(sizeBeforeRemove - 1, list.size());
        assertTrue(isRemoved);
    }

    @Test
    @DisplayName("must remove element by index correctly")
    public void mustCorrectlyRemoveByIndex() {
        MyArrayList list = createDefaultList();
        int sizeBeforeRemove = list.size();
        Assertions.assertAll("testing removing by index",
                () -> assertEquals(DEFAULT_MID_ELEMENT, list.remove(DEFAULT_MID_INDEX)),
                () -> assertEquals(sizeBeforeRemove - 1, list.size())
        );
    }

    @Test
    @DisplayName("must return correct element by index")
    public void mustReturnCorrectElement() {
        MyArrayList list = createDefaultList();
        assertEquals(DEFAULT_MID_ELEMENT, list.get(DEFAULT_MID_INDEX));
    }

    @Test
    @DisplayName("must set an element by index")
    public void mustSetElementByIndex () {
        MyArrayList list = createDefaultList();
        String newValue = "New element";
        Object returnObject = list.set(DEFAULT_MID_INDEX, newValue);
        assertEquals(newValue, list.get(DEFAULT_MID_INDEX));
        assertEquals(newValue, returnObject);
    }

    @Test
    @DisplayName("must return last index of the element")
    public void mustReturnLastIndex() {
        MyArrayList list = createDefaultList();
        assertEquals(DEFAULT_MID_INDEX, list.lastIndexOf(DEFAULT_MID_ELEMENT));
    }

    @Test
    @DisplayName("must return list as array")
    public void mustReturnArray () {
        MyArrayList list = createDefaultList();
        Object[] array = list.toArray();

        boolean isArraysEqual = true;

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(array[i])) isArraysEqual = false;
        }

        assertTrue(isArraysEqual);
    }

    public MyArrayList createDefaultList() {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("Elem " + i);
        }
        return list;
    }
}
