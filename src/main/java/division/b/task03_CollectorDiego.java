package division.b;


import java.util.*;

public class task03_CollectorDiego {

    private List<Integer> massiveString(Scanner scanner) {
        String buffer;
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            buffer = scanner.nextLine();
            if (!buffer.isEmpty()) {
                for (String mark : buffer.split(" ")) {
                    list.add(Integer.parseInt(mark));
                }
                break;
            }
        }
        return list;

    }

    private void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            int countMark = scanner.nextInt();
            Set<Integer> set = new HashSet<>(massiveString(scanner));
            List<Integer> numbersMark = new ArrayList<>(set);
            int countCollector = scanner.nextInt();
            List<Integer> collectorMark = massiveString(scanner);
            for (int i = 0; i < countCollector; i++) {
                int countCollectorMark = 0;
                int numberMinMarkCollector = collectorMark.get(i);
                int size = numbersMark.size();
                for (int j = 0; j < size; j++) {
                    if (numbersMark.get(size - j - 1) < numberMinMarkCollector) {
                        countCollectorMark = size - j;
                        break;
                    }
                }
                System.out.println(countCollectorMark);
            }
        }

    }

    public static void main(String[] args) {
        task03_CollectorDiego task03_collectorDiego = new task03_CollectorDiego();
        task03_collectorDiego.start();
    }
}
