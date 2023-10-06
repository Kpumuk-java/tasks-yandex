package division.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task05_GoodLine {

    public long start (File input) {
        long answer = 0;
        try (Scanner scanner = new Scanner (input)) {
            int count = scanner.nextInt();
            int[] massive = new int[count];
            for (int i = 0; i < count; i++) {
                massive[i] = scanner.nextInt();
                if (i > 0) {
                    answer += massive[i] - massive[i - 1] >= 0 ? massive[i - 1] : massive[i];
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return answer;
    }

    public static void main(String[] args) {
        task05_GoodLine task05_goodLine = new task05_GoodLine();
        System.out.println(task05_goodLine.start(new File("src/main/resources/text/input4.txt")));

    }
}
