package Homework_2207_2907.Ex6_Daemon;

import java.util.concurrent.TimeUnit;

public class MyDaemon extends Thread {
    public MyDaemon() {
        System.out.println("State MyDaemon = " + getState());
        setDaemon(true);
        start();


    }

    @Override
    public void run() {
        System.out.println("=========================================================================================");
        System.out.println("MyDaemon Name: " + getName() + " started");
        System.out.println("State MyDaemon = " + getState());
        System.out.println("Priority MyDaemon = " + getPriority());
        System.out.println("ContextClassLoader MyDaemon = " + getContextClassLoader());
        System.out.println("AllStackTraces MyDaemon = " + getAllStackTraces());
        System.out.println("StackTrace MyDaemon = " + getStackTrace());
        System.out.println("ThreadGroup MyDaemon = " + getThreadGroup());
        System.out.println("Class MyDaemon = " + getClass());
        System.out.println("UncaughtExceptionHandler MyDaemon = " + getUncaughtExceptionHandler());
        System.out.println("=========================================================================================");
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MyResurs.printList();
        }
    }
}

