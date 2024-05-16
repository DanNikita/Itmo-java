package Lab11_Threads;

public class Thread1 extends Thread {

    public Thread1() {
        System.out.println(Thread1.currentThread().getState());
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {

            System.out.println(Thread1.currentThread().getName() + " " + i + " Status: " + Thread1.currentThread().getState());
        }
        System.out.println("Process is finished " + Thread1.currentThread().getState());
    }
}
