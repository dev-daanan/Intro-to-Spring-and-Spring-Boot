package com.daanan.IntrotoSpringandSpringBoot.datastructure.SinglyLinkList;

public class SinglyNode<T> {
    private T data;
    private SinglyNode<T> next;

    public SinglyNode(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public SinglyNode<T> getNext() {
        return next;
    }

    public void setNext(SinglyNode<T> next) {
        this.next = next;
    }
}
