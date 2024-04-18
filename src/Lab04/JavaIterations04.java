package Lab04;

import java.util.Scanner;

public class JavaIterations04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean res = false;
        System.out.println("Enter the first number:");
        int first = sc.nextInt();
        System.out.println("Enter the second number:");
        int second = sc.nextInt();
        System.out.println("Enter the third number:");
        int third = sc.nextInt();
        if (second > first && third > second) {
            res = true;
        }
        System.out.println("result is:" + res);
    }
}