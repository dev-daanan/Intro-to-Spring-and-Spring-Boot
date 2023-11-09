package com.daanan.IntrotoSpringandSpringBoot;

import com.daanan.IntrotoSpringandSpringBoot.service.QueueService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QueueTest {

    @Autowired
    private QueueService<String> stringQueueService;

    @Test
    public void testQueueOperations() {
        // Check if the queue is initially empty
        System.out.println("Is initially empty: " + stringQueueService.isEmpty());

        // Enqueue elements using the service
        stringQueueService.enqueue("A");
        stringQueueService.enqueue("B");
        stringQueueService.enqueue("C");

        // Check if the queue is not empty after enqueuing
        System.out.println("Is not empty after enqueuing: " + !stringQueueService.isEmpty());

        // Check the front element without dequeueing
        System.out.println("Front element: " + stringQueueService.front());

        // Dequeue an element and check if it's removed from the front
        System.out.println("Dequeued: " + stringQueueService.dequeue());
        System.out.println("Front element after dequeue: " + stringQueueService.front());

        // Dequeue remaining elements
        System.out.println("Dequeued: " + stringQueueService.dequeue());
        System.out.println("Dequeued: " + stringQueueService.dequeue());

        // Check if the queue is empty after dequeuing all elements
        System.out.println("Is empty after dequeuing all elements: " + stringQueueService.isEmpty());

    }
}
