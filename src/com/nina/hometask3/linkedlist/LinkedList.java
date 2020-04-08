package com.nina.hometask3.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int capacity = 0;

    public void add(int value) {
        Node node = new Node(value, null);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        capacity++;
    }

    public int getByIndex(int index) {
        if (index < 0 || index >= capacity) {
            throw new IllegalArgumentException("Invalid index provided");
        }

        int cnt = 0;
        Node curr = head;

        while (cnt != index) {
            curr = curr.next;
            cnt++;
        }
        return curr.value;
    }

    public int removeByIndex(int index) {
        if (index < 0 || index >= capacity) {
            throw new IllegalArgumentException("Invalid index provided");
        }

        if (index == 0) {
            Node toRemove = head;
            head = head.next;
            capacity--;
            return toRemove.value;
        }

        int cnt = 1;
        Node prev = head;

        while (cnt != index) {
            prev = prev.next;
            cnt++;
        }

        Node toRemove = prev.next;
        prev.next = toRemove.next;

        if (toRemove == tail) {
            tail = prev;
        }

        capacity--;
        return toRemove.value;
    }

    public void display() {
        System.out.println("\nLinked list:");

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }

    private static final class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
