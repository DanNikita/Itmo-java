package Lab04;

import java.util.Arrays;

public class JavaIterations05 {
    public static void main(String[] args) {
        boolean result = false;
        int[] arr = {3, 5, 6, 7, 8, 3};
        if (arr[0] == 3 && arr[arr.length - 1] == 3) {
            result = true;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }
}
