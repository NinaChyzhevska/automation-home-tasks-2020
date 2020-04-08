package com.nina.hometask3.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(19);
        linkedList.add(-3);
        linkedList.add(12);

        linkedList.display();
        linkedList.removeByIndex(4);
        linkedList.display();
    }
}
