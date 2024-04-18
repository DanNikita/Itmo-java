package Lab04;

public class JavaIterations02 {
    public static void main(String[] args) {
        divNumbers();
    }
    public static void divNumbers()
    {
        for (int i = 1; i < 101; i = i + 1) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("can be divided by 3 and 5 - " + i);
                continue;
            } else if (i % 3 == 0) {
                System.out.println("can be divided by 3 - " + i);
            } else if (i % 5 == 0) {
                System.out.println("can be divided by 5 - " + i);
            }
        }
    }
}
