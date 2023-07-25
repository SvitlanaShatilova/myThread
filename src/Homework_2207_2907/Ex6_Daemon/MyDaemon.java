package Homework_2207_2907.Ex6_Daemon;

import java.util.concurrent.TimeUnit;

public class MyDaemon extends Thread {
    public MyDaemon() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " Daemon: started");
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MyResurs.printList();
        }
    }
}
