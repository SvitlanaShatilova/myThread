package Homework_interesting_task;

import java.util.concurrent.TimeUnit;

public class Baraki_Thread extends Thread{
    public Baraki_Thread() {
        start();
    }

    @Override
    public void run() {
        while (GoldMine.gold > 1) {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }GoldMine.barakiGetPerson();
        }
    }
}

