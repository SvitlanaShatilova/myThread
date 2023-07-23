package Test;

public class MyThread extends Thread {
    private int count = 0;

    @Override
    public void run() {
        String threadName = currentThread().getName();
        System.out.println(threadName + threadName);
        while (count<5){
            System.out.println(++count);
            try{
                sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }


    }
}
