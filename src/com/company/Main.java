package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    public static void main(String[] args) {
        //WaitList
        System.out.println("WaitList:");
        IWaitList<Integer> waitList = new WaitList<Integer>();
        for (int i = 0; i < 5; i++){
            waitList.add(i + 1);
        }
        System.out.println(waitList);
        waitList.remove();
        System.out.println("remove()\n" + waitList);
        int data = (int)(Math.random() * 10);
        System.out.println("contains " + data + "? " + waitList.contains(data));
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(2);
        queue.add(3);
        System.out.println("containsAll " + queue + "? " + waitList.containsAll(queue));
        System.out.println("isEmpty? " + waitList.isEmpty());

        //BoundedWaitList
        System.out.println("\nBoundedWaitList:");
        waitList = new BoundedWaitList<Integer>(2);
        for (int i = 0; i < 5; i++){
            waitList.add(i + 1);
        }
        System.out.println(waitList);

        //UnfairWaitList
        System.out.println("\nUnfairWaitList");
        UnfairWaitList<Integer> uWaitList = new UnfairWaitList<Integer>();
        for (int i = 0; i < 5; i++){
            uWaitList.add(i + 1);
        }
        System.out.println(uWaitList);
        data = (int)(Math.random() * 10) % 5 + 1;
        uWaitList.remove(data);
        System.out.println("remove(" + data + ")");
        System.out.println(uWaitList);
        data = (int)(Math.random() * 100) + 10;
        uWaitList.moveToBack(data);
        System.out.println("moveToBack(" + data + ")");
        System.out.println(uWaitList);
    }
}
