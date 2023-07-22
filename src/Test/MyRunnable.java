package Test;

public class MyRunnable implements Runnable{
    private int count = 0;

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        while (count < 5){
            System.out.println(++count);

            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}
