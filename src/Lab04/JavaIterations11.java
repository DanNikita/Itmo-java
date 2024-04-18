package Lab04;

import java.util.Arrays;

public class JavaIterations11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(arrSort(arr));
    }

    public static String arrSort(int[] arr) {
        String result = "error";
        for (int i : arr) {
            if (arr[i] != 0 && arr.length - 1 != i) {
                if (arr[i] > arr[i - 1]) {
                    continue;
                } else {
                    result =  "Try again";
                    break;
                }

            } else if (arr.length - 1 == i) {
                if (arr[i] > arr[i - 1]) {
                    result =  "OK";
                    break;
                }

            } else {
                continue;
            }
        }
        return result;
    }
}

