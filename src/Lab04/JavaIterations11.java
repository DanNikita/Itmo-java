package Lab04;

import java.util.Arrays;

public class JavaIterations11 {
    public static void main(String[] args) {
        boolean result = false;
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i : arr) {
            if (arr[i] != 0 && arr.length - 1 != i) {
                if (arr[i] > arr[i - 1]) {
                    continue;
                } else {
                    System.out.println("Try again");
                    break;
                }

            } else if (arr.length - 1 == i) {
                if (arr[i] > arr[i - 1]) {
                    System.out.println("OK");
                    break;
                }

            } else {
                continue;
            }
        }

    }
}
