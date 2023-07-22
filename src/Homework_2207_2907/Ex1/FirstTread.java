package Homework_2207_2907.Ex1;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class FirstTread extends Thread{
    private int count = 0;

    @Override
    public void run() {
        String time = new SimpleDateFormat("mm:ss:SSS").format(new Date());
        String threadName = currentThread().getName();
        System.out.println("потік " + threadName + " стартував " + time);
        while (count<5){
            System.out.println(++count);
            try{
                sleep(200);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        String time1 = new SimpleDateFormat("mm:ss:SSS").format(new Date());
        System.out.println("потік " + threadName + " фінішував " + time1);
    }
}
