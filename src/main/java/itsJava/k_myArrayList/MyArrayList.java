package itsJava.k_myArrayList;

import java.util.Arrays;

public class MyArrayList {
    private Object[] array;
    private final static int DEFAULT_CAPACITY = 10;
    private int realSize;


    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return realSize == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] newArray = new Object[3 * realSize / 2 + 1];
            System.arraycopy(array, 0, newArray, 0, realSize);
            array = newArray;
        }
        array[realSize] = o;
        realSize++;
        return true;
    }

    public boolean remove(Object o) {
        Object[] resultArray = new Object[array.length];
        int removeIndex = realSize;
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                removeIndex = i;
                realSize--;
                break;
            }
            resultArray[i] = array[i];
        }
        if (removeIndex == realSize) return false;
        if (realSize - removeIndex >= 0)
            System.arraycopy(array, removeIndex + 1, resultArray, removeIndex, realSize - removeIndex);
        array = resultArray;
        return true;
    }

    public Object remove(int index) {
        if (index < 0 || index > realSize - 1) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
        Object returnObject;
        if (realSize == 1) {
            returnObject = array[0];
            clear();
            return returnObject;
        }
        returnObject = array[index];
        Object[] newArray = new Object[realSize - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, newArray.length - index);
        array = newArray;
        realSize--;
        return returnObject;
    }

    public void clear() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public void checkIndex(int index) {
        if (index < 0 || index > realSize - 1) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    public Object set(int index, Object element) {
        array[index] = element;
        return element;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = realSize - 1; i >= 0; i--) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public Object[] toArray() {
        Object[] newArray = new Object[realSize];
        System.arraycopy(array, 0, newArray, 0, realSize);
        return newArray;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            result.append(array[i]);
            if (i < realSize - 1) {
                result.append(", ");
            }
        }
        result.append("}");
        return result.toString();
    }
}
