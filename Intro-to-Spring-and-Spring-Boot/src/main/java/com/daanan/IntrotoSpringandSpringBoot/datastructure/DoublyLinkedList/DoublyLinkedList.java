package com.daanan.IntrotoSpringandSpringBoot.datastructure.DoublyLinkedList;

import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
public class DoublyLinkedList<T> {

    private DoublyNode<T> head;
    private DoublyNode<T> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a new node to the end of the doubly linked list
    public void insert(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    // Delete a node with the given data from the doubly linked list
    public void delete(T data) {
        DoublyNode<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                if (currentNode == head && currentNode == tail) {
                    head = null;
                    tail = null;
                } else if (currentNode == head) {
                    head = currentNode.getNext();
                    head.setPrev(null);
                } else if (currentNode == tail) {
                    tail = currentNode.getPrev();
                    tail.setNext(null);
                } else {
                    DoublyNode<T> prevNode = currentNode.getPrev();
                    DoublyNode<T> nextNode = currentNode.getNext();
                    prevNode.setNext(nextNode);
                    nextNode.setPrev(prevNode);
                }
                return; // Node found and deleted
            }
            currentNode = currentNode.getNext();
        }
    }

    // Display the elements of the doubly linked list
    public void display() {
        DoublyNode<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " <-> ");
            currentNode = currentNode.getNext();
        }
        System.out.println("null");
    }

    // Check if the doubly linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Returns the head of the linked list if present
    public DoublyNode<T> getHead() {
        if (isEmpty()) {
            throw new NoSuchElementException("Linked list is empty");
        }
        return head;
    }
}

