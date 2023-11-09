package com.daanan.IntrotoSpringandSpringBoot.service;

import com.daanan.IntrotoSpringandSpringBoot.datastructure.SinglyLinkList.SinglyLinkedList;
import com.daanan.IntrotoSpringandSpringBoot.datastructure.SinglyLinkList.SinglyNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinglyLinkedListService<T> {
    private final SinglyLinkedList<T> genericSinglyLinkedList;

    @Autowired
    public SinglyLinkedListService(SinglyLinkedList<T> genericSinglyLinkedList) {
        this.genericSinglyLinkedList = genericSinglyLinkedList;
    }

    public void addToSinglyLinkedList(T data) {
        genericSinglyLinkedList.addLast(data);
    }

    public void removeFromSinglyLinkedList(T data) {
        genericSinglyLinkedList.delete(data);
    }

    public void displaySinglyLinkedList() {
        System.out.println("Singly Linked List Contents:");
        SinglyNode<T> currentNode = genericSinglyLinkedList.getHead();
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
