package org.example;
import org.junit.Test;

import static org.example.Main.testMethods;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;


public class MainTest {

    @Test
    public void testAddMethod1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        testMethods("AL add", 10, arrayList);
        assertEquals(10, arrayList.size());
    }

    @Test
    public void testDeleteMethod1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        testMethods("AL delete", 1, arrayList);
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testGetMethod1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        testMethods("AL get", 1, arrayList);
        assertEquals(Integer.valueOf(5), arrayList.get(0));
    }

    @Test
    public void testAddMethod() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        testMethods("AL add", 10, linkedList);
        assertEquals(10, linkedList.size());
    }

    @Test
    public void testDeleteMethod() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        testMethods("AL delete", 1, linkedList);
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testGetMethod() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        testMethods("AL get", 1, linkedList);
        assertEquals(Integer.valueOf(5), linkedList.get(0));
    }
}