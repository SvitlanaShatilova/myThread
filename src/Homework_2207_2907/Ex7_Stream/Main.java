package Homework_2207_2907.Ex7_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**Створити список та заповнити рандомними числами 10 осередків,
 * потрібно вивести суму квадратів усіх елементів списку.
 Ми використовуємо метод map() для зведення квадрат кожного елемента,
 а потім застосовуємо метод reduce() для обʼєднання всіх елементів в одне число.*/

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .map(i -> ((int)Math.pow(i, 2)))
                .forEach(System.out::println);

        Optional<Integer> result = numbers.stream()
                .map(i -> ((int)Math.pow(i, 2)))
                .reduce((x,y)->x+y);
        System.out.println("Сума = " + result.get());

    }
}
