package com.daanan.IntrotoSpringandSpringBoot.service;

import com.daanan.IntrotoSpringandSpringBoot.datastructure.DoublyLinkedList.DoublyLinkedList;
import com.daanan.IntrotoSpringandSpringBoot.datastructure.DoublyLinkedList.DoublyNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoublyLinkedListService<T> {

    private final DoublyLinkedList<T> genericDoublyLinkedList;

    @Autowired
    public DoublyLinkedListService(DoublyLinkedList<T> genericDoublyLinkedList) {
        this.genericDoublyLinkedList = genericDoublyLinkedList;
    }

    public void addToDoublyLinkedList(T data) {
        genericDoublyLinkedList.insert(data);
    }

    public void removeFromDoublyLinkedList(T data) {
        genericDoublyLinkedList.delete(data);
    }

    public void displayDoublyLinkedList() {
        System.out.println("Doubly Linked List Contents:");
        DoublyNode<T> currentNode = genericDoublyLinkedList.getHead();
        while (currentNode != null) {
            System.out.print("-> ");
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
