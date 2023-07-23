package Homework_2207_2907.Ex4_Multithreading;

import java.util.concurrent.TimeUnit;

/**Написати багатопоточне додаток наступного функціонала:
 Поток №1 - очікує, поки йому не прийдуть деякі дані у вигляді цифрового ідентифікатора (id). Коли id приходить - він записує у файл (result.txt) id і поточний час і дату у форматі yyyy-mm-dd HH:MI:SS з нової строки
 Поток №2 - раз в 2 мекунди генерує випадковий id типу int і записує його в колекцію.
 Потік №3 - раз в 10 секунд обходить колекцію, згадану в потоці 2, і відправляє айдишники в потік №1, видаляючи вже відправлені елементи
 Зразок виконання
 ID: 81 Date: 2023-07-21 22:11:36
 ID: 63 Date: 2023-07-21 22:11:40
 ID: 74 Date: 2023-07-21 22:11:40*/
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Class_Id classId = new Class_Id();

        Thread oneThred = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start:");
                int count = 0;
                while (count < 3) {
                  classId.getingId();
                  count++;

                }
            }
        };

        Thread twoThred = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start:");
                int count = 0;
                while (count < 10) {
                    classId.generationId();
                    count++;

                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread threeThred = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start:");
                int count = 0;
                while (count < 5) {
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                classId.setingId();
                count++;
                }
            }
       };


        oneThred.start();
        twoThred.start();
        threeThred.start();
        oneThred.join();
        twoThred.join();
        threeThred.join();


        classId.listPrint();
        classId.readFile();


    }
}
