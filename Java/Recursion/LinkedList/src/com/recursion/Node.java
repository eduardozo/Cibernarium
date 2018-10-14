package com.recursion;

public class Node {
    int value;
    Node next;

    public Node() {
        value = 0;
        next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
