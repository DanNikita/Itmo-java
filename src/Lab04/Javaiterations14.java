package Lab04;

public class Javaiterations14 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 1, 3};

        for (int i = 0; i < arr.length - 1; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter = counter + 1;
                    System.out.println(arr[i] + " equals " + arr[j]);
                } else if (arr[i] != arr[j]) {
                    System.out.println(arr[i] + " not the same as " + arr[j]);
                }
            }
            if (counter == 1) {
                System.out.println("The number is unique: " + arr[i]);
                break;
            }
        }
    }
}
