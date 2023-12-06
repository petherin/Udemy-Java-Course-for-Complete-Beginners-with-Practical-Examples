package com.beginner;

import java.util.Random;

public class ArraysApp {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        Random randomer=new Random();

        lotteryNumbers[0]=randomer.nextInt(90) + 1;
        lotteryNumbers[1]=27;
        lotteryNumbers[2]=37;
        lotteryNumbers[3]=47;
        lotteryNumbers[4]=57;

        for (int lotteryNumber : lotteryNumbers) {
            System.out.println(lotteryNumber);
        }

        int[][] weeklyLotteryNumbers={
                {1,2,3,4,5},
                {10,20,30,40,50},
                {11,21,31,41,51},
                {12,22,23,24,25},
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.println(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
