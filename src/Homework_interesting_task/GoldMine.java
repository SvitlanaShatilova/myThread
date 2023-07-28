package Homework_interesting_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/**Є якась шахта із золотом. Спочатку там 1000 золота.
 На старті програми існують 3 робітники, які майнуть 3 золота в секунду.
 Також існують Бараки, які кожні 10 секунд
 виробляють ще одного робітника (у кожного робітника є ім'я).
 Програма завершується, як закінчується золото в шахті - має залишитись 1 золото.
 Кожну Секунду виводити лог -
 ім'я_робітника: кількість_золота_у_його
 та залишок золота в шахті.*/
public class GoldMine {
    public static int gold = 1000;
    static List<Person> list = new ArrayList<>();
    public static void barakiGetPerson(){
        Person person = new Person();
        list.add(person);

    }

    public static void printInfo(){
        for (Person p: list) {
            System.out.println("Worker " + p.getName() + " mined " + p.getMined() + " gold");
        }
        System.out.println("REST OF THE GOLD: " + gold);
        System.out.println("...");
    }


 public static void minesGold() {

         for (int i = 0; i < list.size(); i++) {
             if (gold > 3) {
                 int val = list.get(i).getMined();
                 list.get(i).setMined(val + 3);
                 gold = gold - 3;
             } else if (gold == 3) {
                 int val = list.get(i).getMined();
                 list.get(i).setMined(val + 2);
                 gold = gold - 2;
             } else if (gold == 2) {
                 int val = list.get(i).getMined();
                 list.get(i).setMined(val + 1);
                 gold = gold - 1;
             } else {
                 System.out.println("Resources are over");
             }
         }
     }








 public static void baraki() {
     Thread thread = new Thread() {
         Person person = new Person();
         public void run() {
             Thread.currentThread().setName(person.getName());
              synchronized (person) {
           //      minesGold(person);
                 try {
                     TimeUnit.SECONDS.sleep(1);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }

                 }
             }
     };

 }

}
