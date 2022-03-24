package exam;

import java.util.Scanner;

public class P06Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigitFromFirstNum = Integer.parseInt(scanner.nextLine());
        int secondDigitFromFirstNum = Integer.parseInt(scanner.nextLine());
        int firstDigitFromSecondNum = Integer.parseInt(scanner.nextLine());
        int secondDigitFromSecondNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isEnd = false;

        for (int firstNumFirstDigit = firstDigitFromFirstNum; firstNumFirstDigit <= 8; firstNumFirstDigit++) {
            for (int firstNumSecondDigit = 9; firstNumSecondDigit >= secondDigitFromFirstNum; firstNumSecondDigit--) {
                for (int secondNumFirstDigit = firstDigitFromSecondNum; secondNumFirstDigit <= 8; secondNumFirstDigit++) {
                    for (int secondNumSecondDigit = 9; secondNumSecondDigit >= secondDigitFromSecondNum; secondNumSecondDigit--) {

                        boolean isValid = firstNumFirstDigit % 2 == 0 &&
                                secondNumFirstDigit % 2 == 0 &&
                                firstNumSecondDigit % 2 != 0 &&
                                secondNumSecondDigit % 2 != 0;

                        int firstNum = firstNumFirstDigit * 10 + firstNumSecondDigit;
                        int secondNum = secondNumFirstDigit * 10 + secondNumSecondDigit;

                        if (isValid && firstNum == secondNum) {
                            System.out.println("Cannot change the same player.");
                        } else if (isValid && firstNum != secondNum) {
                            System.out.printf("%d%d - %d%d%n", firstNumFirstDigit, firstNumSecondDigit, secondNumFirstDigit, secondNumSecondDigit);
                            counter++;
                        }
                        if (counter >= 6) {
                            isEnd = true;
                        }
                        if (isEnd) {
                            break;
                        }
                    }
                    if (isEnd) {
                        break;
                    }
                }
                if (isEnd) {
                    break;
                }
            }
            if (isEnd) {
                break;
            }
        }

    }
}

