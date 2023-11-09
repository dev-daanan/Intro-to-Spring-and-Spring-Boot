package com.daanan.IntrotoSpringandSpringBoot.datastructure.SinglyLinkList;

import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
public class SinglyLinkedList<T> {
    private SinglyNode<T> head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Linked list is empty");
        }
        return head.getData();
    }

    public SinglyNode<T> getHead() {
        if (isEmpty()) {
            throw new NoSuchElementException("Linked list is empty");
        }
        return head;
    }

    public void addFirst(T data) {
        SinglyNode<T> newNode = new SinglyNode<>(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void addLast(T data) {
        SinglyNode<T> newNode = new SinglyNode<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            SinglyNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public void addAfter(T data, T targetData) {
        SinglyNode<T> newNode = new SinglyNode<>(data);
        SinglyNode<T> current = head;

        while (current != null) {
            if (current.getData().equals(targetData)) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                size++;
                return;
            }
            current = current.getNext();
        }

        throw new NoSuchElementException("Target data not found in the linked list");
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Linked list is empty");
        }
        head = head.getNext();
        size--;
    }

    public void delete(T data) {
        if (isEmpty()) {
            throw new NoSuchElementException("Linked list is empty");
        }

        if (head.getData().equals(data)) {
            head = head.getNext();
            size--;
            return;
        }

        SinglyNode<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(data)) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }

        throw new NoSuchElementException("Data not found in the linked list");
    }

    public boolean contains(T data) {
        SinglyNode<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        SinglyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getData();
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
