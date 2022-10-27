package com.company;

import java.util.Collection;

/**
 * IWaitList interface
 * @author Razch
 */
public interface IWaitList<E> {

    /**
     * adds element
     * @param element {@linkplain E E}
     */
    public void add(E element);

    /**
     * removes and returns element
     * @return {@linkplain E E}
     */
    public E remove();

    /**
     * checks for existence of element is in List
     * @param element {@linkplain E E}
     * @return boolean
     */
    public boolean contains(E element);

    /**
     *checks for existence of elements is in List
     * @param c {@linkplain Collection<E> Collection<E>}
     * @return boolean
     */
    public boolean containsAll(Collection<E> c);

    /**
     * checks for emptiness
     * @return boolean
     */
    public boolean isEmpty();

}
