package Homework_2207_2907.Ex3_Unblocking;

import java.util.concurrent.TimeUnit;

public class ClassA {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void incrementCount() {

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(count++ + " ");
        }
        System.out.println();
    }
}