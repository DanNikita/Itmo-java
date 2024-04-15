package Lab01;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1.1
        System.out.println("I");
        System.out.println("know");
        System.out.println("Java");
        System.out.println("Well");

        //1.2
        double a = (46 + 10) * (10d / 3);
        int b = 29 * 4 * (-15);
        System.out.println("a=" + a + ", b=" + b);

        //1.3
        int number = 10500;
        var result = ((double)number / 10) / 10;
        System.out.println("result= " + result);

        //1.4
        var result1 = 3.6 * 4.1 * 5.9;
        System.out.println("result1= " + result1);

        //1.5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println("First number " + c);
        System.out.println("Second number " + d);
        System.out.println("Third number " + e);

        //1.6
        System.out.println("Enter 1 number:");
        int v = scanner.nextInt();
        if (v > 100 && (v % 2 == 0)) {
            System.out.println("Out of range");
        } else if (v % 2 == 0) {
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");

        //2.1

    }
}