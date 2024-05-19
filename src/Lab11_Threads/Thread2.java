package Lab11_Threads;

public class Thread2 implements Runnable {

    Counter cnt;

    Thread2(Counter cnt) {
        this.cnt = cnt;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            cnt.increment();
            System.out.println(cnt.getCount());
        }
    }
}
