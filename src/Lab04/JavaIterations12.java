package Lab04;

import java.util.Arrays;
import java.util.Scanner;

public class JavaIterations12 {
    public static void main(String[] args) {
        System.out.println("Result: " + Arrays.toString(printArr()));
    }

    public static int[] printArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        /* for (int i : arr) {
            System.out.println("Enter element #" + i); // i - очередной элемент массива. Изначально 0 (вывод Enter element #0)
            i = sc.nextInt();// в данном случае присваиваем нулевому элементу число. В Следующей итерации снова ноль и снова присваивание нулевому эл-ту.
    }
     */

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element #" + i);
            arr[i] = sc.nextInt();
        }


        System.out.println("Array length: " + arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
       return arr;
    }
}
