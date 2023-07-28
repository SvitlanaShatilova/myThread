package Homework_interesting_task;

import java.security.SecureRandom;
import java.util.Arrays;

/**Є якась шахта із золотом. Спочатку там 1000 золота.
 На старті програми існують 3 робітники, які майнуть 3 золота в секунду.
 Також існують Бараки, які кожні 10 секунд
 виробляють ще одного робітника (у кожного робітника є ім'я).
 Програма завершується, як закінчується золото в шахті - має залишитись 1 золото.
 Кожну Секунду виводити лог -
 ім'я_робітника: кількість_золота_у_його
 та залишок золота в шахті.
 Приклад
 Worker Barb Bashirian mined 3 gold
 Worker Keira Okuneva mined 3 gold
 Worker Reba Christiansen mined 3 gold
 REST OF THE GOLD: 991
 ...
 Worker Barb Bashirian mined 117 gold
 Worker Keira Okuneva mined 117 gold
 Worker Reba Christiansen mined 117 gold
 Worker Carter Bernhard mined 87 gold
 Worker Kirk Lueilwitz mined 57 gold
 Worker Chang Hickle mined 27 gold
 REST OF THE GOLD: 478
 ...
 Worker Barb Bashirian mined 180 gold
 Worker Keira Okuneva mined 180 gold
 Worker Reba Christiansen mined 180 gold
 Worker Carter Bernhard mined 150 gold
 Worker Kirk Lueilwitz mined 120 gold
 Worker Chang Hickle mined 90 gold
 Worker Latia Okuneva MD mined 63 gold
 Worker Mauro Kshlerin I mined 33 gold
 Worker Garth Considine mined 3 gold
 REST OF THE GOLD: 1
 !!Робітники майна золото по черзі!!.*/

public class Main {
    public static void main(String[] args) {

        GoldMine.barakiGetPerson();
        GoldMine.barakiGetPerson();
        GoldMine.barakiGetPerson();

        new Gold_Thread();
        new Baraki_Thread();
        new Daemon();

    }
}

