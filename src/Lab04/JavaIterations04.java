package Lab04;

import java.util.Scanner;

public class JavaIterations04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = sc.nextInt();
        System.out.println("Enter the second number:");
        int second = sc.nextInt();
        System.out.println("Enter the third number:");
        int third = sc.nextInt();
        compareMethod(first,second,third);
    }
    public static void compareMethod (int first, int second, int third)
    {
        boolean res = false;
        if (second > first && third > second) {
            res = true;
        }
        System.out.println("result is:" + res);
    }
}