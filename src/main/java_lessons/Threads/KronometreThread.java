package Threads;

public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Thread Oluşturuluyor: " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Thread Çalıştırılıyor: "+ threadName);

        try {
            for (int i = 1; i<=10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread Sonlandırılıyor: " + threadName);
    }
    public void start () {
        System.out.println("Thread Başlatılıyor: " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
