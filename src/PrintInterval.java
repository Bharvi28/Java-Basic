/*
Write a Java program that creates two threads:
● First thread prints numbers from 1 to 10 at the interval of 1 second.
● Second thread prints numbers from 11 to 20 at the interval of 500 ms.
Run both threads and display the output.
 */

class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                Thread.sleep(1000); // 1000 ms = 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                Thread.sleep(500); // 500 ms = 0.5 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class PrintInterval {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
/*
Thread 1: 1
Thread 2: 11
Thread 2: 12
Thread 1: 2
Thread 2: 13
Thread 2: 14
Thread 1: 3
Thread 2: 15
Thread 2: 16
Thread 1: 4
Thread 2: 17
Thread 2: 18
Thread 1: 5
Thread 2: 19
Thread 2: 20
Thread 1: 6
Thread 1: 7
Thread 1: 8
Thread 1: 9
Thread 1: 10
 */