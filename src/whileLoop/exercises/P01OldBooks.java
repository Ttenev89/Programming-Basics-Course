package whileLoop.exercises;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();


        int count = 0;
        boolean flag = false;

        String input  = scanner.nextLine();

        while (!input.equals("No More Books")) {

            if (wantedBook.equals(input)) {
                flag = true;
                break;
            }

            count++;

            input = scanner.nextLine();
        }

        if (flag) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }
    }
}
