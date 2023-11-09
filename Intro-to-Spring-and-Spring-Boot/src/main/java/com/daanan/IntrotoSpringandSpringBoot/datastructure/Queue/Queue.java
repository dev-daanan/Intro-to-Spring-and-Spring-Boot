package com.daanan.IntrotoSpringandSpringBoot.datastructure.Queue;

import org.springframework.stereotype.Component;

import java.util.LinkedList;

@Component
public class Queue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    // Enqueue (add) an element to the end of the queue
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // Dequeue (remove) and return the element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        return queue.removeFirst();
    }

    // Get the element at the front of the queue without removing it
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot get front element.");
        }
        return queue.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get the size (number of elements) of the queue
    public int size() {
        return queue.size();
    }
}
