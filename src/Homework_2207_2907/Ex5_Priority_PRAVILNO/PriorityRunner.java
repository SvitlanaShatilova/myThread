package Homework_2207_2907.Ex5_Priority_PRAVILNO;


import java.util.concurrent.TimeUnit;

public class PriorityRunner implements Runnable {

private final String name;

public PriorityRunner(String name, int priority) {
this.name = name;
Thread.currentThread().setPriority(priority);
new Thread(this).start();
}

@Override
public void run() {
for (int i = 0; i < 5; i++) {
try {
TimeUnit.SECONDS.sleep(1);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println(name + " " + i + " PRIORITY: " + Thread.currentThread().getPriority());
}
}
}

