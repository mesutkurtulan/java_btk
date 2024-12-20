package Threads;

public class Main {
    public static void main(String[] args) {
        KronometreThread thread1 = new KronometreThread("thread_1");
        KronometreThread thread2 = new KronometreThread("thread_2");
        KronometreThread thread3 = new KronometreThread("thread_3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
