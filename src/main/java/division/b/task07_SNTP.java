package division.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task07_SNTP {

    boolean flag;

    private int[] fill(String str) {
        int[] massive = new int[3];
        int i = 0;
        for (String buffer : str.split(":")) {
            massive[i++] = Integer.parseInt(buffer);
        }
        return massive;
    }

    private int calculation(int client, int response, int position) {
        int limit = 60;
        if (position == 0) {
            limit = 24;
        }

        if (flag) {
            response--;
        }

        if (response < client) {
            flag = true;
            return limit - client + response;
        } else {
            flag = false;
            return response - client;
        }
    }


    public String start(File input) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(input)) {
            int[] timeClient = fill(scanner.nextLine());
            int[] timeServer = fill(scanner.nextLine());
            int[] timeClientResponse = fill(scanner.nextLine());

            int[] timeDelay = new int[3];
            int buffer, bufferSplit = 0;
            flag = false;

            for (int i = 2; i >= 0; i--) {
                timeDelay[i] = calculation(timeClient[i], timeClientResponse[i], i);
            }

            for (int i = 0; i < 3; i++) {
                buffer = timeDelay[i];
                timeDelay[i] = buffer / 2;
                timeDelay[i] += bufferSplit;
                if (buffer % 2 != 0) {
                    if (i != 0) {
                        timeDelay[i]++;
                    }
                    bufferSplit = 30;
                } else {
                    bufferSplit = 0;
                }
            }
            int limit = 60;
            bufferSplit = 0;
            for (int i = 2; i >= 0 ; i--) {
                if (i == 0) {
                    limit = 24;
                }
                buffer = timeServer[i] + timeDelay[i] + bufferSplit;
                bufferSplit = 0;
                if (buffer / limit > 0) {
                    bufferSplit++;
                    buffer = buffer % limit;
                }
                stringBuilder.insert(0, buffer < 10 ? "0" + buffer: buffer);
                if (i > 0) {
                    stringBuilder.insert(0,":");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        task07_SNTP task07_sntp = new task07_SNTP();
        System.out.println(task07_sntp.start(new File("src/main/resources/text/input.txt")));
    }
}
