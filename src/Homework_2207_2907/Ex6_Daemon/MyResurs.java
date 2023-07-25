package Homework_2207_2907.Ex6_Daemon;

import java.util.ArrayList;
import java.util.List;

public class MyResurs {

    private static int count = 0;
    static List<Integer> list = new ArrayList<>();

    public static void myMethood(){

            int value = (int) (Math.random() * (1000));
            list.add(value);

    }
    public static void printList(){
        System.out.println(list);
    }
}


