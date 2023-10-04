package division.b;

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class task01_Histogram {

    private TreeMap<Character, Integer> answer;
    private int maxHeight;

    public task01_Histogram() {
        answer = new TreeMap<>();
        maxHeight = 0;
    }

    private void start1(File input) {
        try (Scanner scanner = new Scanner(input)) {
            String bufferString;
            int count;
            while (scanner.hasNextLine()) {
                bufferString = scanner.nextLine();
                for (char buffer : bufferString.toCharArray()) {
                    if (buffer != ' ') {
                        answer.merge(buffer, 1, (a, b) -> answer.get(buffer) + 1);
                        count = answer.get(buffer);
                        if (maxHeight < count) {
                            maxHeight = count;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        printAnswer();
        //print();
    }

    private void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            String stringBuffer;
            int count;
            do  {
                stringBuffer = scanner.nextLine();
                for (char buffer : stringBuffer.toCharArray()) {
                    if (buffer != ' ') {
                        answer.merge(buffer, 1, (a, b) -> answer.get(buffer) + 1);
                        count = answer.get(buffer);
                        if (maxHeight < count) {
                            maxHeight = count;
                        }
                    }
                }
            } while (scanner.hasNextLine());

        }
        printAnswer();
        //print();
    }

    private void printAnswer() {
        for (int i = 0; i < maxHeight; i++) {
            int finalI = i;
            answer.forEach((a, b) -> {
                if (maxHeight - finalI - b > 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            });
            System.out.println();
        }
        answer.forEach((a, b) -> System.out.print(a.toString()));
    }

    private void print() {
        answer.forEach((a, b) -> System.out.println("Key=" + a + " Value=" + b));
    }

    public static void main(String[] args) {
        task01_Histogram task01_Histogram = new task01_Histogram();
        //task01_Histogram.start1(new File("src/main/resources/text/input.txt"));
        task01_Histogram.start();
    }
}
