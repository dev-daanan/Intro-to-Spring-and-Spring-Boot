package com.daanan.IntrotoSpringandSpringBoot;

import com.daanan.IntrotoSpringandSpringBoot.service.DoublyLinkedListService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DoublyLinkedListTest {

    @Autowired
    private DoublyLinkedListService<String> doublyLinkedListService;

    @Test
    public void testDoublyLinkedListOperations() {
        // Add elements to the singly linked list
        doublyLinkedListService.addToDoublyLinkedList("Hello");
        doublyLinkedListService.addToDoublyLinkedList("World");

        // Display the singly linked list
        doublyLinkedListService.displayDoublyLinkedList();

        // Remove an element from the singly linked list
        doublyLinkedListService.removeFromDoublyLinkedList("Hello");

        // Display the updated singly linked list
        doublyLinkedListService.displayDoublyLinkedList();
    }
}
