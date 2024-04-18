package Lab04;

import java.util.Scanner;

public class JavaIterations03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = sc.nextInt();
        System.out.println("Enter the second number:");
        int second = sc.nextInt();
        System.out.println("Enter the third number:");
        int third = sc.nextInt();

        System.out.println("result is:" + sumMethod(first, second, third));
    }
    public static boolean sumMethod(int first, int second, int third) {
        boolean res = false;
        if ((first + second) == third) {
            res = true;
        }
        return res;

    }
}
