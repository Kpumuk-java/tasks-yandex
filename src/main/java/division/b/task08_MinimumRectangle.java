package division.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task08_MinimumRectangle {

    public String start(File input) {
        try (Scanner scanner = new Scanner(input)) {
            int countRectangle = scanner.nextInt();
            int[] answer = new int[4];
            int bufferX = scanner.nextInt();
            int bufferY = scanner.nextInt();
            answer[0] = answer[2] = bufferX;
            answer[1] = answer[3] = bufferY;
            for (int i = 0; i < countRectangle - 1; i++) {
                bufferX = scanner.nextInt();
                bufferY = scanner.nextInt();
                answer[0] = Math.min(bufferX, answer[0]);
                answer[1] = Math.min(bufferY, answer[1]);
                answer[2] = Math.max(bufferX, answer[2]);
                answer[3] = Math.max(bufferY, answer[3]);
            }
            return answer[0] + " " + answer[1] + " " + answer[2] + " " + answer[3];
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        task08_MinimumRectangle task08_minimumRectangle = new task08_MinimumRectangle();
        System.out.println(task08_minimumRectangle.start(new File("input.txt")));
    }
}