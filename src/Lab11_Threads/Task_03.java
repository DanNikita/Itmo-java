package Lab11_Threads;

public class Task_03 {
    public static void main(String[] args) {
        Thread first = new Thread(new Thread3());
        Thread second = new Thread(new Thread3());
        first.start();
        second.start();
    }
}
