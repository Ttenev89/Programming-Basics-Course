package examPrepare.P03Exam6And7April2019;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rent  = Integer.parseInt(scanner.nextLine());

        double statues = rent - rent * 0.30;
        double catering = statues - statues * 0.15;
        double sound = catering - catering * 0.50;

        double totalPrice = rent + statues + catering + sound;

        System.out.printf("%.2f", totalPrice);
    }
}
