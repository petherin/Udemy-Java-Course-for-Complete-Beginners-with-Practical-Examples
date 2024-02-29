package com.advanced.exceptions;

import java.io.IOException;

public class SportBetApp {
    public static void main(String[] args) {
        getPlayerScore();
    }

    private static void getPlayerScore() {
        try {
            if (somethingHappened) {
                throw new IOException();
            } else if (somethingElseHappened) {
                throw new IllegalAccessException();
            } else if (somethingElseHappenedAgain) {
                throw new IllegalCallerException();
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        } finally {
            throw new NullPointerException;
            return 3;
        }
    }
}
