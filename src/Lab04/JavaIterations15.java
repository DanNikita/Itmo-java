package Lab04;
import java.util.Arrays;
import java.util.Scanner;

public class JavaIterations15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = getRandom (1,10);
            System.out.println("Number is: " + arr[i]);

        }
        /*
        if (arr.length < 2)
            System.out.println("Array is too small");
        else {

        }

*/
    }

    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
