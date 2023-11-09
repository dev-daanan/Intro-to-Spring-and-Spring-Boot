package com.daanan.IntrotoSpringandSpringBoot.service;

import com.daanan.IntrotoSpringandSpringBoot.datastructure.Queue.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueueService<T> {

    private final Queue<T> genericQueue;

    @Autowired
    public QueueService(Queue<T> genericQueue) {
        this.genericQueue = genericQueue;
    }

    // Enqueue (add) an element to the end of the queue
    public void enqueue(T item) {
        genericQueue.enqueue(item);
    }

    // Dequeue (remove) and return the element from the front of the queue
    public T dequeue() {
        return genericQueue.dequeue();
    }

    // Get the element at the front of the queue without removing it
    public T front() {
        return genericQueue.front();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return genericQueue.isEmpty();
    }

    // Get the size (number of elements) of the queue
    public int size() {
        return genericQueue.size();
    }
}
