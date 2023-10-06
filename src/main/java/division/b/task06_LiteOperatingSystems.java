package division.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class task06_LiteOperatingSystems {

    public int start(File input) {
        int answer = 0;
        try (Scanner scanner = new Scanner(input)) {
            int countSector = scanner.nextInt();
            int countSave = scanner.nextInt();

            Map<Integer, Integer> map = new TreeMap<>();
            int beginSector = 0, endSector = 0;
            Iterator<Map.Entry<Integer, Integer>> iterator;

            for (int i = 0; i < countSave; i++) {
                beginSector = scanner.nextInt();
                endSector = scanner.nextInt();

                if (endSector > countSector) {
                    continue;
                }

                iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, Integer> entry = iterator.next();
                    int key = entry.getKey();
                    if (key > endSector) {
                        break;
                    }
                    int buffer = map.get(key);
                    if (buffer < beginSector) {
                        continue;
                    }
                    iterator.remove();
                    answer--;
                }
                map.put(beginSector, endSector);
                answer++;
            }




        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }


        return answer;
    }

    public static void main(String[] args) {
        task06_LiteOperatingSystems task06_liteOperatingSystems = new task06_LiteOperatingSystems();
        System.out.println(task06_liteOperatingSystems.start(new File("src/main/resources/text/input3.txt")));
    }
}
