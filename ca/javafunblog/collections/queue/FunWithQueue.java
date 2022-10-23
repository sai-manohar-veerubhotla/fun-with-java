package ca.javafunblog.collections.queue;

import ca.javafunblog.collections.list.ListUtil;

import java.util.LinkedList;

import java.util.Queue;

public class FunWithQueue {

    private static void queueDemo() {
        Queue<Integer> queueBackedByLinkedList = new LinkedList<>(ListUtil.list());
        System.out.println(queueBackedByLinkedList);
        // O(1)
        System.out.println(queueBackedByLinkedList.poll()); // removes the first element and returns it
        System.out.println(queueBackedByLinkedList.offer(10)); // adds the element to the queue and returns true if it is successful
        System.out.println(queueBackedByLinkedList);

        // QUEUE'S CS TERMINOLOGY
        // poll();
        // offer(e);

        System.out.println(queueBackedByLinkedList.peek()); // retrieves the first element and returns it - DOES NOT REMOVE IT

        System.out.println(queueBackedByLinkedList.element()); // same as peek()

    }

    public static void main(String[] args) {
        queueDemo();
    }


}
