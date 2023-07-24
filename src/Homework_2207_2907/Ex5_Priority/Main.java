package Homework_2207_2907.Ex5_Priority;
/**Демонстрація пріоритетів.
 Створити 2 класи PriorityRunner та PriorityThread.
 Запустити 3 потоки із пріоритетами (min, max, norm).
 За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.*/
public class Main {
    public static void main(String[] args) throws InterruptedException{
        PriorityRunner priorityRunner = new PriorityRunner();

        PriorityThread priorityThread_Max = new PriorityThread(priorityRunner);
        priorityThread_Max.setPriority(10);
        priorityThread_Max.setName("PriorityThread_Max");

        PriorityThread priorityThread_Min = new PriorityThread(priorityRunner);
        priorityThread_Min.setPriority(1);
        priorityThread_Min.setName("PriorityThread_Min");

        PriorityThread priorityThread_Norm = new PriorityThread(priorityRunner);
        priorityThread_Norm.setPriority(5);
        priorityThread_Norm.setName("PriorityThread_Norm");


        priorityThread_Min.start();
        priorityThread_Norm.start();
        priorityThread_Max.start();
        priorityThread_Min.join();
        priorityThread_Norm.join();
        priorityThread_Max.join();

    }

}
