package nestedLoops.exercises;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 0;
        boolean flag = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {

                current++;
                if (current > n) {
                    flag = true;
                    break;
                }
                System.out.print(current + " ");
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
