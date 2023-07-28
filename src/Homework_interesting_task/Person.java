package Homework_interesting_task;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Person {

    private String name;
    private int mined = 0;

    public Person() {
        var random = new SecureRandom();
        var list1 = Arrays.asList("Noah","Liam","William","Mason","James","Benjamin","Jacob","Michael",
                "Elijah","Ethan","Emma","Olivia","Ava","Sophia","Isabella","Mia","Charlotte","Abigail","Emily",
                "Harper","Everett","Henry","Charlie","Edwin","Marshall","Calvin","Edgar","Lola","Lillian",
                "Stella","Genevieve","Cora","Evelyn","Clara","Ruby","Eva","Prescott","Grover","Oberon","Regis",
                "Thelonious","Flannery","Alberta","Sigourney","Talullah","Antigone");
        var random2 = new SecureRandom();
        var list2 = Arrays.asList("Brook", "Hill","Fields","Small","Bigg","Little","Joice","Younger","Wise","Gay","Smith",
                "Jines","Taylor","Brown","Davies","Evans","Bailey","Parker","Miller","Davis","Murphy",
                "Price","Bell","Wilson","Thomas","Roberts","Jonhnson","Liwis","Robinson","Wood","White","Baker",
                "Kelly","Simpson","Marshall","Collins","Bennett","Cox","Fox","Gray","Rose","Hunt","Shaw","Lloyd",
                "Lee","Ellis","Khan","Reid","Murray","Clark","Scott","Powell","Palmer","Hill");


        String name1 = list1.get(random.nextInt(list1.size()));
        String name2 = list2.get(random2.nextInt(list2.size()));
        String name3 = name1.concat(" ").concat(name2);
        this.name = name3;


    }

    public String getName() {
        return name;
    }

    public int getMined() {
        return mined;
    }

    public void setMined(int mined) {
        this.mined = mined;
    }


}
