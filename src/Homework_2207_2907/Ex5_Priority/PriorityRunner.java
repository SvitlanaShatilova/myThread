package Homework_2207_2907.Ex5_Priority;

import java.util.concurrent.TimeUnit;

/**Демонстрація пріоритетів.
 Створити 2 класи PriorityRunner та PriorityThread.
 Запустити 3 потоки із пріоритетами (min, max, norm).
 За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.*/
public class PriorityRunner{

    public synchronized void getI50() {
        String threadName = Thread.currentThread().getName();
                  System.out.print(threadName + ": ");
           for (int i = 1; i <= 50; i++){
               try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
               System.out.print(i + " ");
           }
           System.out.println();
           System.out.println("потік " + threadName + " закінчив свою роботу. " + " Стан потоку = " + Thread.currentThread().getState());
           System.out.println();
    }
}
