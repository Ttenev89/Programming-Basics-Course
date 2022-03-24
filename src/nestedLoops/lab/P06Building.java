package nestedLoops.lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        for (int floor = countFloors; floor >= 1; floor--) {
            for (int room = 0; room < countRooms; room++) {


                String typeRoom = "";
                if (floor == countFloors) {
                    typeRoom = "L";
                } else if (floor % 2 == 0) {
                    typeRoom = "O";
                } else {
                    typeRoom = "A";
                }

                System.out.printf("%s%d%d ", typeRoom, floor, room);
            }
            System.out.println();
        }
    }
}
