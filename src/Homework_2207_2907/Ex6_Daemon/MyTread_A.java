package Homework_2207_2907.Ex6_Daemon;

import java.util.concurrent.TimeUnit;

public class MyTread_A extends Thread{
    private final String name;

    MyTread_A(String name) {
        this.name = name;
        start();

    }

    @Override
    public void run() {
        System.out.println(name + " started");
       // MyDaemon daemon = new MyDaemon();

        for (int i = 1; i <= 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " цикл № " + i);
            MyResurs.myMethood();
        }
    }
}
