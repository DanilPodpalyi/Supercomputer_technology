package Lab9.T1;

public class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++)
            if (i % 10 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    public static void main(String[] aga) {
        MyRunnable thread = new MyRunnable();
        for (int i = 0; i < 3; i++)
            new Thread(thread).start();
    }
}
