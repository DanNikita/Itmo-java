package Lab05;

import java.util.Scanner;

public class LearningStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "this is a typical string and it is cooooooool";
        String b = "noon";
        System.out.println(longestWord(a));
        boolean res = palindrome(b);
        System.out.println(res);
        String snatchMovie = "Turkish: [voice over] Boris the Blade, or Boris “the Bullet Dodger.” As bent as the Soviet sickle, and as hard as the hammer that crosses it. Apparently, it’s just impossible to kill the bastard.";
        System.out.println(explcitContent(snatchMovie));
        System.out.println(stringInString(snatchMovie, "Boris"));
        System.out.println(reverseString("Boris"));
    }

    public static String longestWord(String text) {
        String[] words;
        int max = 0;
        int maxind = 0;
        words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                maxind = i;
                max = words[i].length();
            }
        }
        return "This is the longest word: " + words[maxind];
    }

    public static boolean palindrome(String word) {
        boolean palindrome = false;
        word = word.toLowerCase();
        StringBuilder a = new StringBuilder(word);
        StringBuilder b = new StringBuilder(word);
        b.reverse();
        System.out.println(a + " " + b);
        return palindrome = a.toString().equals(b.toString());
    }

    public static String explcitContent(String text) {
        return text.replaceAll("bastard", "!!!EXPLICIT!!!");
    }

    public static String stringInString(String a, String b) {
        if (!a.contains(b)) {
            return "no substrings in the main string";
        }
        int counter = 0;
        int index = 0;
        int last = a.lastIndexOf(b);
        System.out.println("last index is " + last);
        for (int i = 0; i <= last; ) {
            index = a.indexOf(b, i);
            i = i + index;
            counter = counter + 1;
            System.out.println("i = " + i + " " + "counter = " + counter + " " + "index = " + index);
        }
        return "substrings matched times: " + counter;
    }

    public static String reverseString(String s) {
        int count = s.length() - 1;
        String reversed = "";
        for (int i = 0; i <= count; i++) {
            reversed = reversed + s.charAt(count - i);
        }
        return "The given string is: " + s + "\nThe string reversed by word: \n" + reversed;
    }

}
