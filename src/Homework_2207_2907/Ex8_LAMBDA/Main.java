package Homework_2207_2907.Ex8_LAMBDA;
/**Напишіть основні арифметичні дії калькулятора, використовуючи лямбда-вирази*/
public class Main {
    public static void main(String[] args) {

       Calculate calculate = (x, y) -> x + y;
       int sum = calculate.calk(10, 20);
       System.out.println(" + = " + sum);

        Calculate calculate1 = (x, y) -> x - y;
        int sub = calculate1.calk(10, 20);
        System.out.println(" - = " + sub);

        Calculate calculate2 = (x, y) -> x * y;
        int mul = calculate2.calk(10, 20);
        System.out.println(" * = " + mul);

        Calculate calculate3 = (x, y) -> x / y;
        int div = calculate3.calk(100, 20);
        System.out.println(" / = " + div);

    }
}

