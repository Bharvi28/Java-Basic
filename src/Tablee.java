/*
Write a Java program where two threads print multiplication tables (e.g., Table of 5 and Table of
7). Use a synchronized method so that table outputs do not mix and remain consistent.
 */
// Class with synchronized method
class Table {

    // synchronized method
    synchronized void printTable(int n) {
        System.out.println("\nTable of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(200); // small delay to show effect
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread 1
class Threadd1 extends Thread {
    Table t;

    Threadd1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

// Thread 2
class Threadd2 extends Thread {
    Table t;

    Threadd2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(7);
    }
}

// Main class
public class Tablee {
    public static void main(String[] args) {

        Table obj = new Table(); // shared object

        Threadd1 t1 = new Threadd1(obj);
        Threadd2 t2 = new Threadd2(obj);

        t1.start();
        t2.start();
    }
}
/*
Table of 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50

Table of 7
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
 */