package whileLoop.exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double needMoney = Double.parseDouble(scanner.nextLine());
        double savedMoney = Double.parseDouble(scanner.nextLine());
        int countSpendDays = 0;
        int countDays = 0;

        while (savedMoney < needMoney) {
            if (countSpendDays == 5) {
                break;
            }

            String action = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());
            countDays++;
            if (action.equals("spend")) {
                savedMoney = savedMoney - currentMoney;
                countSpendDays++;
                if (savedMoney < 0) {
                    savedMoney = 0;
                }

            } else {
                savedMoney = savedMoney + currentMoney;
                countSpendDays = 0;
            }


        }

        if(countSpendDays == 5){
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        }else{
            System.out.printf("You saved the money for %d days.",countDays);
        }
    }
}
