package Lab11_Threads;

public class Thread3 implements Runnable {
    private final String lock = "Any Object here,really";

    @Override
    public void run() {
        while (true) synchronized (lock) {
            {
                System.out.println(Thread.currentThread().getName());
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("exception: " + e);
                }

            }
        }
    }

}
