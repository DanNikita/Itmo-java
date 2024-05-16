package Lab11_Threads;

public class Task_02 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(new Thread2(counter));
            t.setName("Thread" + i);
            t.start();
            System.out.println(t.getName() + t.getState());
        }
        System.out.println(counter.getCount());


    }
}
