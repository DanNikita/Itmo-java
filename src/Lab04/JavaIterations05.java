package Lab04;

import java.util.Arrays;

public class JavaIterations05 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 8, 3};

        System.out.println(Arrays.toString(arr));
        System.out.println(uniqueMethod(arr));
    }

    public static boolean uniqueMethod(int[] arr) {
        boolean result = false;
        if (arr[0] == 3 && arr[arr.length - 1] == 3) {
            result = true;
        }
        return result;

    }
}
