package com.advanced.timetypes;

public class StringPerformanceApp {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Takes 1.2s, very slow
//        String testString = "";
//        for (int i = 0; i < 100000; i++) {
//            testString += i;
//        }

        //  Takes 3ms so much faster than a string
        // StringBuilder is not thread safe
//        StringBuilder something = new StringBuilder("");
//        for (int i = 0; i < 100000; i++) {
//            something.append(i);
//        }
//
        // StringBuffer is thread safe
        // Takes 4ms Nearly as fast as StringBuilder
        StringBuffer anything = new StringBuffer("");
        for (int i = 0; i < 100000; i++) {
            anything.append(i);
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("It took " + totalTime / 1000000 + "ms");
    }
}
