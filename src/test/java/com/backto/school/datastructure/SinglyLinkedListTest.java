package com.backto.school.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void addShouldAppendElements() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void newListShouldBeEmpty() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertEquals(0, list.size());
    }

    @Test
    void addFirstShouldIncreaseSize() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(10);
        assertEquals(1, list.size());
        list.addFirst(20);
        assertEquals(2, list.size());
    }

    @Test
    void addFirstShouldAddToFront() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void addLastShouldIncreaseSize() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(10);
        assertEquals(1, list.size());
        list.addLast(20);
        assertEquals(2, list.size());
    }

    @Test
    void addLastShouldAppendToEnd() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void removeShouldDecreaseSize() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.remove(2);
        assertEquals(2, list.size());
    }

    @Test
    void removeShouldRemoveFirstElement() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals(2, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void removeShouldRemoveMiddleElement() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.remove(2);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void removeShouldRemoveLastElement() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.remove(3);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    void removeNonExistentShouldNotChangeList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.remove(99);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    void removeFromSingleElementList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(42);
        list.remove(42);
        assertEquals(0, list.size());
    }

    @Test
    void getShouldThrowForInvalidIndex() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(5));
    }

    @Test
    void getShouldThrowForEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }
}
