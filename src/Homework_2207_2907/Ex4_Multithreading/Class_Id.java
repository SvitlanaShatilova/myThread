package Homework_2207_2907.Ex4_Multithreading;

import java.util.HashSet;
import java.util.Set;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public synchronized int getingId(){
        System.out.println("Trying to get ID ...");
        if (id == null){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Returned ID is " + id);
        return id;
    }

    public synchronized void setingId(int id){
        System.out.println("Insert new ID " + id);
        this.id = id;
        System.out.println("ID is placed");
        notify();
    }

    public synchronized int generationId(){
       int value = (int) (Math.random() * (1000));
       return value;
    }
}
