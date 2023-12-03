package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    SinglyLinkedList<Integer> listTest;

    @Before
    public void setUp() {
        listTest = new SinglyLinkedList<>();
    }

    @Test
    public void testAdd() {
        listTest.add(5);

        Assert.assertNotNull(listTest);

    }

    @Test
    public void testRemove() {
        listTest.add(5);

        listTest.remove(0);

        Assert.assertNull(listTest.head);
    }
}
