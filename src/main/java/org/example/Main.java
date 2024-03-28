package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Метод для тестирования различных операций с коллекцией.
 */

public class Main {
    public static void main(String[] args) {
        int numOperations = 5000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        testMethods("AL add", numOperations, arrayList);
        testMethods("AL delete", numOperations, arrayList);
        testMethods("AL get", numOperations, arrayList);

        testMethods("LLt add", numOperations, linkedList);
        testMethods("LL delete", numOperations, linkedList);
        testMethods("LL get", numOperations, linkedList);
    }

    public static void testMethods(String methodName, int numOperations, java.util.List<Integer> list) {
        long startTime = System.nanoTime();

        for (int i = 0; i < numOperations; i++) {
            if (methodName.contains("add")) {
                list.add(i);
            } else if (methodName.contains("delete")) {
                list.remove(0);
            } else if (methodName.contains("get")) {
                if (!list.isEmpty()) {
                    list.get(0);
                }
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println(methodName + " - " + numOperations + " times, duration: " + duration + " ms");
    }
}