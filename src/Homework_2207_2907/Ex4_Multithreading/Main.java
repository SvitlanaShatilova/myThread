package Homework_2207_2907.Ex4_Multithreading;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;
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
    public static void main(String[] args) {
        Class_Id classId = new Class_Id();
        List<Integer> integerSet = new ArrayList<>();
       // int val = classId.getingId();
       // System.out.println(val);
        int val2 = classId.generationId();
        System.out.println(val2);



//        String time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date());
//        System.out.println(time);

        File file = new File("C:\\Users\\User\\IdeaProjects\\myThread\\src\\Homework_2207_2907\\Ex4_Multithreading\\result.txt");
        Thread oneThred = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start:");
                int val = classId.getingId();
                try {
                    FileWriter fw = new FileWriter(file, true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println("ID: " + val + " Date: " + new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date()));
                    pw.flush();
                    pw.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        Thread twoThred = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start:");
                while (integerSet.size() < 10){
                    int val = classId.generationId();
                    integerSet.add(val);
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
    };
        Thread threeThred = new Thread() {
            public void run() {
                int count = 0;
                System.out.println(Thread.currentThread().getName() + " start:");
                while (count < 10){
                    int val = integerSet.get(0);
                    classId.setingId(val);
                    integerSet.remove(0);
                    count++;
                    try {
                        TimeUnit.SECONDS.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };


//        oneThred.start();
//        twoThred.start();
//        threeThred.start();


    }
}
