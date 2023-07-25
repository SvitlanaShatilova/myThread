package Homework_2207_2907.Ex6_Daemon;
/**Створіть Daemon-потік і виведіть про нього якнайбільше інформації.*/
public class Main {
    public static void main(String[] args) {

        new MyTread_A("Tread_ONE");
        new MyTread_A("Tread_TWO");
        new MyTread_A("Tread_THREE");
        new MyTread_A("Tread_FOUR");
        new MyDaemon();
    }
}
