package Lab04;

import java.util.Arrays;

public class JavaIterations13 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        replaceArray(arr1);
    }

    public static void replaceArray(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (i == 0) {
                arr2[arr1.length - 1] = arr1[i];
            } else if (i == arr1.length - 1) {
                arr2[0] = arr1[arr1.length - 1];
            } else {
                arr2[i] = arr1[i];
            }
        }
        System.out.println("Array 1" + Arrays.toString(arr1));
        System.out.println("Array 2" + Arrays.toString(arr2));
    }
}
