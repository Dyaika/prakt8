package com.company;

/**
 * BoundedWaitList class
 * @author Razch
 */
public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    /**
     * @return int
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * parametrised constructor
     * @param capacity int
     */
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    /**
     * adds element to end if possible
     * @param element {@linkplain E E}
     */
    @Override
    public void add(E element) {
        if (content.size() < capacity){
            super.add(element);
        }
    }

    /**
     * toString
     * @return String
     */
    @Override
    public String toString() {
        return content.toString() + " capacity=" + capacity;
    }
}
