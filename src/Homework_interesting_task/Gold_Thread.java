package Homework_interesting_task;

import java.util.concurrent.TimeUnit;



public class Gold_Thread extends Thread {

    public Gold_Thread() {
        start();
    }

    @Override
    public void run() {
        while (GoldMine.gold > 1) {
            GoldMine.minesGold();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

