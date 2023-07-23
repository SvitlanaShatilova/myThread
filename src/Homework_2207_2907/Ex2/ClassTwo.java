package Homework_2207_2907.Ex2;

import java.util.concurrent.TimeUnit;

public class ClassTwo {
    private int count = 100;

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



