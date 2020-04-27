package com.nina.hometask3.linkedlist;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int capacity = 0;

    public void add(T value) {
        Node<T> node = new Node<>(value, null);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        capacity++;
    }

    public T getByIndex(int index) {
        if (index < 0 || index >= capacity) {
            throw new IllegalArgumentException("Invalid index provided");
        }

        int cnt = 0;
        Node<T> curr = head;

        while (cnt != index) {
            curr = curr.next;
            cnt++;
        }
        return curr.value;
    }

    public T removeByIndex(int index) {
        if (index < 0 || index >= capacity) {
            throw new IllegalArgumentException("Invalid index provided");
        }

        if (index == 0) {
            Node<T> toRemove = head;
            head = head.next;
            capacity--;
            return toRemove.value;
        }

        int cnt = 1;
        Node<T> prev = head;

        while (cnt != index) {
            prev = prev.next;
            cnt++;
        }

        Node<T> toRemove = prev.next;
        prev.next = toRemove.next;

        if (toRemove == tail) {
            tail = prev;
        }

        capacity--;
        return toRemove.value;
    }

    public int size() {
        return capacity;
    }

    public void display() {
        System.out.println("\nLinked list:");

        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }

    private static final class Node<K> {
        K value;
        Node<K> next;

        public Node(K value, Node<K> next) {
            this.value = value;
            this.next = next;
        }
    }
}
