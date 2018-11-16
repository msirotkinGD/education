package Interfases;

import java.util.*;

public class MyList implements Collection {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements; //default array < 10 items
    private Object[] commonElements = {}; //common array for getting size
    private int tempElementsLength; //temporary number for getting the new array length

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < commonElements.length; i++) {
            if (commonElements[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean isPresent = false;
        for (int i = 0; i < commonElements.length; i++) {
            if (commonElements[i] == o) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[commonElements.length];
        for (int i = 0; i < commonElements.length; i++) {
            if (commonElements[i] != null) {

            }
        }
        return elements;
    }

    @Override
    public boolean add(Object o) {
        boolean wasChanged = false;
        if (size() < DEFAULT_CAPACITY) {
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == null) {
                    elements[i] = o;
                    commonElements = elements;
                    break;
                }
            }
            tempElementsLength++;
        } else {
            Object[] newElements = new Object[++tempElementsLength];
            System.arraycopy(commonElements, 0, newElements, 0, commonElements.length);
            for (int i = 0; i < newElements.length; i++) {
                if (newElements[i] == null) {
                    newElements[i] = o;
                    commonElements = newElements;
                    break;
                }
            }
            wasChanged = true;
        }
        return wasChanged;
    }

    @Override
    public boolean remove(Object o) {
        boolean wasRemoved = false;
        Object[] newElements = new Object[commonElements.length];
        Object[] newElementsDecr;
        for (int i = 0; i < commonElements.length; i++) {
            if (commonElements[i].equals(o)) {
                newElementsDecr = new Object[newElements.length - 1];
                System.arraycopy(newElements, 0, newElementsDecr, 0, newElementsDecr.length);
                newElements = newElementsDecr;
                wasRemoved = true;
            } else {
                for (int k = 0; k < newElements.length; k++) {
                    if (newElements[k] == null) {
                        newElements[k] = commonElements[i];
                        break;
                    }
                }
            }
        }
        commonElements = newElements;
        return wasRemoved;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[1];
    }

    private class MyIterator implements Iterator {
        private boolean hasNext = false;
        private Object[] objects = commonElements;
        private int currentElement = 0;
        private Object nextObject;

        @Override
        public boolean hasNext() {
            if (next() != null) {
                hasNext = true;
            }
            return hasNext;
        }

        @Override
        public Object next() {
            if (objects[currentElement] != null) {
                nextObject = objects[currentElement++];
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
            return nextObject;
        }
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals = false;
        for (int i = 0; i < commonElements.length; i++) {
            if (commonElements[i].hashCode() == obj.getClass().hashCode() && commonElements[i] != null) {
                isEquals = true;
            }
        }
        return isEquals;
    }
}
