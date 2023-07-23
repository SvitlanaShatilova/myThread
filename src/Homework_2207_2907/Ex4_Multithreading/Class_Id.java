package Homework_2207_2907.Ex4_Multithreading;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**Написати багатопоточне додаток наступного функціонала:
 Поток №1 - очікує, поки йому не прийдуть деякі дані у вигляді цифрового ідентифікатора (id). Коли id приходить - він записує у файл (result.txt) id і поточний час і дату у форматі yyyy-mm-dd HH:MI:SS з нової строки
 Поток №2 - раз в 2 мекунди генерує випадковий id типу int і записує його в колекцію.
 Потік №3 - раз в 10 секунд обходить колекцію, згадану в потоці 2, і відправляє айдишники в потік №1, видаляючи вже відправлені елементи
 Зразок виконання
 ID: 81 Date: 2023-07-21 22:11:36
 ID: 63 Date: 2023-07-21 22:11:40
 ID: 74 Date: 2023-07-21 22:11:40*/
public class Class_Id {
    private Integer id = null;
    List<Integer> integerSet = new ArrayList<>();


    public void listPrint() {
        System.out.println("Перевірка наявних ID у списку: " + integerSet);

    }


    File file = new File("C:\\Users\\User\\IdeaProjects\\myThread\\src\\Homework_2207_2907\\Ex4_Multithreading\\result.txt");

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        notify();
    }

    public synchronized void getingId() {

        System.out.println("Trying to get ID ...");
        if (id == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int val = id;

            try {
                FileWriter fw = new FileWriter(file, true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println("ID: " + val + " Date: " + new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date()));
                pw.flush();
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Записано до файлу ID = " + id);
            id = null;
        }
    }

    public synchronized void setingId() {
        int val = integerSet.get(0);

        this.id = val;
        integerSet.remove(0);
        System.out.println("Insert new ID " + id);
        notify();
    }

    public synchronized void generationId() {
        int value = (int) (Math.random() * (1000));
        integerSet.add(value);
        System.out.println("Random = " + value);

    }

    public void readFile() {
        System.out.println("Дані з файлу rezalt.txt:");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String temp = null;

            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
