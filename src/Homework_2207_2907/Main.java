package Homework_2207_2907;

import java.util.Calendar;

/**Затримка потоку.
 Необхідно створити три потоки, кожних із цих потоків запустити (наприклад: main, second, first),
 Вивести - поток 'NAME' стартував - 'DateTime'
 Коли поток закінчив роботу - поток 'NAME' фінішував - 'DateTime'
 Коли всі ці потоки успішно відпрацюють – вивести на екран повідомлення
 Всі потоки завершили роботу */
public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String mainThreadName = Thread.currentThread().getName();
        System.out.println("потік " + mainThreadName + " стартував " + calendar.getTime());

        SecondThread secondThread = new SecondThread();
        FirstTread firstTread = new FirstTread();

        secondThread.start();
        firstTread.start();

        while (secondThread.isAlive() == true|| firstTread.isAlive() == true){

        }
        System.out.println("Всі потоки завершили роботу");
    }
}
