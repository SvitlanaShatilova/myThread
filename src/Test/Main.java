package Test;

public class Main {
    public static void main(String[] args) {
       String mainThreadName = Thread.currentThread().getName();
       System.out.println(mainThreadName);
//
        Thread myRun = new Thread(new MyRunnable());
        myRun.start();
        //myRun.run();


//        MyThread myThread = new MyThread();
//        myThread.start();
//        myThread.run();

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        System.out.println(myThread1.getState());

        myThread1.start();
        myThread2.start();
        myThread3.start();


        System.out.println("Всі потоки завершили свою роботу");


    }

}
