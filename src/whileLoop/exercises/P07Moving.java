package whileLoop.exercises;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;

        while (volume > 0) {

            String input = scanner.nextLine();

            if (input.equals("Done")) {
                break;
            }

            int pack = Integer.parseInt(input);
            volume -= pack;

        }
        if (volume > 0) {
            System.out.printf("%d Cubic meters left.", volume);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        }
    }
}
