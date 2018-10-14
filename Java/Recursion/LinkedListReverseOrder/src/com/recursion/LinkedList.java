package com.recursion;

public class LinkedList {
    static Node head = new Node();

    public static void main(String[] args) {

        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        
        printList(node1);
        printListReverse(node1);

    }

    private static void printListReverse(Node n) {
        if (n != null) {
            printListReverse(n.next);
            System.out.print(n.value + " ");
        }
    }

    private static void printList(Node n) {
        if (n != null) {
            System.out.println(n.value + " ");
            printList(n.next);
        }
    }
}
