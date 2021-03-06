package whileLoop.moreExercises;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean oHasOccurred = false;
        boolean cHasOccurred = false;
        boolean nHasOccurred = false;

        StringBuilder word = new StringBuilder();

        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            char letter = input.charAt(0);
            boolean appendLetter = false;
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                switch (letter) {
                    case 'o':
                        appendLetter = oHasOccurred;
                        oHasOccurred = true;
                        break;
                    case 'n':
                        appendLetter = nHasOccurred;
                        nHasOccurred = true;
                        break;
                    case 'c':
                        appendLetter = cHasOccurred;
                        cHasOccurred = true;
                        break;
                    default:
                        appendLetter = true;
                }
            }

            if (appendLetter) {
                word.append(letter);
            }

            if (oHasOccurred && nHasOccurred && cHasOccurred) {
                System.out.print(word.toString() + ' ');
                word = new StringBuilder();
                oHasOccurred = false;
                cHasOccurred = false;
                nHasOccurred = false;
            }
        }
    }
}
