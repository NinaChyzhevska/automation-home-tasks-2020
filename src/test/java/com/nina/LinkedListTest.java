package com.nina;

import com.nina.hometask3.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListTest {
    @Test
    public void addStringValueTest() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Name");
        list.add("Surname");

        assertEquals("Name", list.getByIndex(0));
        assertEquals("Surname", list.getByIndex(1));
    }

    @Test
    public void addIntegerValueTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(27);
        assertEquals(27, list.getByIndex(0));
    }

    @Test
    public void removeByIndexTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(-5);
        list.add(99);
        list.removeByIndex(0);

        assertEquals(1, list.size());
        assertEquals(99, list.getByIndex(0));
    }

    @Test
    public void testIllegalArgument() {
        LinkedList<Integer> list = new LinkedList<>();

        assertThrows(IllegalArgumentException.class, () -> list.removeByIndex(0));
    }
}
