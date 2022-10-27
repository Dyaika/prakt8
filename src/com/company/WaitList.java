package com.company;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * WaitList super class, implements {@linkplain IWaitList IWaitList interface}, contains {@linkplain java.util.concurrent.ConcurrentLinkedQueue ConcurrentLinkedQueue}
 * @author Razch
 */
public class WaitList<E> implements IWaitList<E>{

    protected ConcurrentLinkedQueue<E> content;

    /**
     * Constructor of WaitList without parameters
     */
    public WaitList() {
        content = new ConcurrentLinkedQueue<E>();
    }

    /**
     * Constructor of WaitList with parameter
     * @param content {@linkplain java.util.concurrent.ConcurrentLinkedQueue ConcurrentLinkedQueue}
     */
    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = content;
    }

    /**
     * adds element to end
     * @param element {@linkplain E E}
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * removes and returns first element
     * @return {@linkplain E E}
     */
    @Override
    public E remove() {
        return content.remove();
    }

    /**
     * checks for existence of element is in List
     * @param element {@linkplain E E}
     * @return boolean
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     *checks for existence of elements is in List
     * @param c {@linkplain Collection<E> Collection<E>}
     * @return boolean
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    /**
     * checks for emptiness
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    /**
     * toString
     * @return String
     */
    @Override
    public String toString() {
        return content.toString();
    }
}
