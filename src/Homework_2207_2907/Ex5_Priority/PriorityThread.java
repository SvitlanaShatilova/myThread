package Homework_2207_2907.Ex5_Priority;

import java.util.concurrent.TimeUnit;

/**Демонстрація пріоритетів.
 Створити 2 класи PriorityRunner та PriorityThread.
 Запустити 3 потоки із пріоритетами (min, max, norm).
 За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.*/
public class PriorityThread extends Thread{

private final PriorityRunner PriorityRunner;
    public PriorityThread(PriorityRunner priorityRunner) {
        PriorityRunner = priorityRunner;
    }
    public synchronized void run() {
        PriorityRunner.getI50();
    }
}
