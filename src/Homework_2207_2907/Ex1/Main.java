package Homework_2207_2907.Ex1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**Затримка потоку.
 Необхідно створити три потоки, кожних із цих потоків запустити (наприклад: main, second, first),
 Вивести - поток 'NAME' стартував - 'DateTime'
 Коли поток закінчив роботу - поток 'NAME' фінішував - 'DateTime'
 Коли всі ці потоки успішно відпрацюють – вивести на екран повідомлення
 Всі потоки завершили роботу */
public class Main {
    public static void main(String[] args) {

        String time = new SimpleDateFormat("mm:ss:SSS").format(new Date());
        String mainThreadName = Thread.currentThread().getName();
        System.out.println("потік " + mainThreadName + " стартував " + time);

        FirstTread firstTread = new FirstTread();
        SecondThread secondThread = new SecondThread();

        firstTread.start();
        secondThread.start();

        while (secondThread.isAlive() == true|| firstTread.isAlive() == true){

        }
        System.out.println("Всі потоки завершили роботу");
        System.out.println(firstTread.getState());
        System.out.println(secondThread.getState());
    }
}
