package com.daanan.IntrotoSpringandSpringBoot;

import com.daanan.IntrotoSpringandSpringBoot.service.SinglyLinkedListService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SinglyLinkedListTest {

    @Autowired
    private SinglyLinkedListService<String> singlyLinkedListService;

    @Test
    public void testSinglyLinkedListOperations() {
        // Add elements to the singly linked list
        singlyLinkedListService.addToSinglyLinkedList("Hello");
        singlyLinkedListService.addToSinglyLinkedList("World");

        // Display the singly linked list
        singlyLinkedListService.displaySinglyLinkedList();

        // Remove an element from the singly linked list
        singlyLinkedListService.removeFromSinglyLinkedList("Hello");

        // Display the updated singly linked list
        singlyLinkedListService.displaySinglyLinkedList();
    }
}
