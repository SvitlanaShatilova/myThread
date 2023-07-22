package Homework_2207_2907;

import java.util.Calendar;

public class SecondThread extends Thread{
    private int count = 0;

    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        String threadName = currentThread().getName();
        System.out.println("потік " + threadName + " стартував " + calendar.getTime());
        System.out.println(threadName);
        while (count<5){
            System.out.println(++count);
            try{
                sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        Calendar calendar1 = Calendar.getInstance();
        System.out.println("потік " + threadName + " фінішував " + calendar1.getTime());


    }
}
