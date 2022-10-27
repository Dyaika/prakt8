package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * UnfairWaitList class.  In this {@linkplain WaitList WaitList}, you can remove an element that is not the first in the {@linkplain java.util.concurrent.ConcurrentLinkedQueue queue}
 * @author Razch
 */
public class UnfairWaitList<E> extends WaitList<E> {

    /**
     * Constructor of {@linkplain UnfairWaitList UnfairWaitList} without parameters
     */
    public UnfairWaitList() {}

    /**
     * removes and returns element
     * @return {@linkplain E E}
     */
    public void remove(E element) {
        content.remove(element);
    }

    /**
     * puts element to the start of {@linkplain ConcurrentLinkedQueue<E>}
     * @param element {@linkplain E}
     */
    void moveToBack(E element){
        ConcurrentLinkedQueue<E> temp = new ConcurrentLinkedQueue<E>();
        temp.add(element);
        temp.addAll(content);
        content.clear();
        content.addAll(temp);
    }
}
