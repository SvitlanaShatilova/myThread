package Homework_2207_2907.Ex3_Unblocking;

import java.util.concurrent.TimeUnit;

/**Створити 2 класи. Реалізувати взаємне блокування цих класів*/
public class Main {
    public static void main(String[] args)throws InterruptedException{
        deadLockClass();


    }
    private static void deadLockClass()throws InterruptedException{
        ClassA classOne = new ClassA();

        ClassB classTwo = new ClassB();

        Thread oneThred = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start:");
                synchronized (classOne) {
                    classOne.incrementCount();
                    try {
                        TimeUnit.SECONDS.sleep(2);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " continues:");
                    {
                        synchronized (classTwo) {
                            classTwo.incrementCount();
                        }
                        System.out.println(Thread.currentThread().getName() + " end");
                    }
                }
            }
        };
        Thread twoTread = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start:");
                synchronized (classOne) {
                    classOne.incrementCount();
                    try {
                        TimeUnit.SECONDS.sleep(2);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " continues:");
                    {
                        synchronized (classTwo) {
                            classTwo.incrementCount();
                        }
                        System.out.println(Thread.currentThread().getName() + " end");
                    }
                }
            }
        };

        oneThred.start();
        twoTread.start();
        oneThred.join();
        twoTread.join();

    }
}
