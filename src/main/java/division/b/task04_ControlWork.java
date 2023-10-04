package division.b;

import java.util.Scanner;

public class task04_ControlWork {

    private void start() {

        try (Scanner scanner = new Scanner(System.in)) {
            int countStudents = scanner.nextInt();
            int task = scanner.nextInt();
            int cell = scanner.nextInt();
            int roll = scanner.nextInt();

            int placePeta = roll == 1 ? cell * 2 - 1 : cell * 2;
            int taskPeta = placePeta % task == 0 ? task : placePeta % task;
            int taskVasia;
            int cellVasiaRight = -1, rollVasiaRight = -1, cellVasiaLeft = -1, rollVasiaLeft = -1;


            int placeVasia = placePeta + task;
            if (placeVasia <= countStudents) {
                cellVasiaRight = placeVasia % 2 == 0 ? placeVasia / 2 : placeVasia / 2 + 1;
                rollVasiaRight = placeVasia % 2 == 0 ? 2 : 1;
            }

            placeVasia = placePeta - task;
            if (placePeta - task > 0) {
                cellVasiaLeft = placeVasia % 2 == 0 ? placeVasia / 2 : placeVasia / 2 + 1;
                rollVasiaLeft = placeVasia % 2 == 0 ? 2 : 1;
            }
            if (cellVasiaRight > 0 || cellVasiaLeft > 0) {
                if (cellVasiaRight > 0 && cellVasiaLeft > 0) {
                    if (cellVasiaRight - cell > cell - cellVasiaLeft) {
                        System.out.println(cellVasiaLeft + " " + rollVasiaLeft);
                    } else {
                        System.out.println(cellVasiaRight + " " + rollVasiaRight);
                    }
                    return;
                }
                if (cellVasiaRight > 0) {
                    System.out.println(cellVasiaRight + " " + rollVasiaRight);
                    return;
                }
                System.out.println(cellVasiaLeft + " " + rollVasiaLeft);
                return;
            }

            System.out.println(-1);
        }
    }


    public static void main(String[] args) {
        task04_ControlWork task04_controlWork = new task04_ControlWork();
        task04_controlWork.start();

    }

}
