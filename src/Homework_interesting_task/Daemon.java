package Homework_interesting_task;

import Homework_2207_2907.Ex6_Daemon.MyResurs;

import java.util.concurrent.TimeUnit;

public class Daemon extends Thread {
    public Daemon() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GoldMine.printInfo();
        }
    }
}

