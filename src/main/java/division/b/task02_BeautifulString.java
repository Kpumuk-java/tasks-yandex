package division.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task02_BeautifulString {

    int maxLength;

    private int countChange(List<Character> list, int position, int count, int sumChar) {
        if (position < list.size()) {

        }
        return 0;
    }


    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            int changeBuffer = scanner.nextInt();
            String str = scanner.nextLine();
            List<Character> list = new ArrayList<>();
            for (char c : str.toCharArray()) {
                list.add(c);
            }
            maxLength = 0;
            System.out.println(Math.max(maxLength, countChange(list, 0, changeBuffer, 0)));
        }


    }


    public static void main(String[] args) {
        task02_BeautifulString task02_beautifulString = new task02_BeautifulString();
    }
}
