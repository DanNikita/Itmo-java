package Lab10;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;


public class Files {
    public static void main(String[] args) throws IOException {

        File file = new File("Files/text01.txt");
        System.out.println(readFile(file));
        File file1 = new File("Files/text02.txt");
        writeFile("Biker cannot be both old and stupid at the same time", file1);
        File file2 = new File("Files/text03.txt");
        twoInOne(file, file1, file2);
        File file3 = new File("Files/text04.txt");
        replaceSpaces(file2);

    }

    public static String readFile(File file) throws FileNotFoundException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                result.append(line);
//            line = reader.readLine();
//            return line;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return result.toString();
    }

    public static void writeFile(String input, File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            System.out.println("Using the following file to write " + file.toString());
            writer.write(input);
            System.out.println("The next string is saved to file: " + input);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void twoInOne(File file1, File file2, File file3) {
        StringBuilder total = new StringBuilder();
        String summary;
        try {
            total.append(readFile(file1));
            total.append("\n =========================================================== \n");
            total.append(readFile(file2));
            System.out.println("Two original files has been read successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        summary = total.toString();
        try {
            writeFile(summary, file3);
            System.out.println("Third file has been written successfully");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void replaceSpaces(File file) {
        String original, result;
        try {
            original = readFile(file);
            System.out.println("Original file found. Remaking...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String dollar = Matcher.quoteReplacement("$");
        result = original.replaceAll("[^A-Za-z0-9_]", dollar);
        try {
            writeFile(result, file);
            System.out.println("Original file is replaced with: " + result);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
