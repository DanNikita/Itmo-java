package Lab04;

import java.util.Arrays;

public class JavaIterations06 {
    public static void main(String[] args) {
        boolean result = false;
        int[] arr = {3, 2, 2, 1, 8, 3};
        for (int i : arr) {
            if ((arr[i] == 1) || (arr[i] == 5)) {
                result = true;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }
}
