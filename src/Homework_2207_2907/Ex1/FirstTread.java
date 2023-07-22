package Homework_2207_2907.Ex1;


import java.util.Calendar;


public class FirstTread extends Thread{
    private int count = 0;

    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        String threadName = currentThread().getName();
        System.out.println("потік " + threadName + " стартував " + calendar.getTime());
        while (count<5){
            System.out.println(++count);
            try{
                sleep(200);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        Calendar calendar1 = Calendar.getInstance();
        System.out.println("потік " + threadName + " фінішував " + calendar1.getTime());
    }
}
