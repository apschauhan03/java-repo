import java.util.Scanner;

public class ReverseDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.print("Enter an character: ");
        char userInputChar = scanner.next().charAt(0);

        // Top half
        for (int i = 1; i <= userInput; i++) {
            // Left stars
            for (int j = 1; j <= userInput - i; j++) {
                System.out.print(userInputChar);
            }
            // Middle spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                // Keep borders as stars
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print(userInputChar);
                } else {
                    System.out.print(" ");
                }
            }
            // Right stars
            for (int j = 1; j <= userInput - i; j++) {
                System.out.print(userInputChar);
            }
            System.out.println();
        }

        // Bottom half
        for (int i = userInput - 1; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= userInput - i; j++) {
                System.out.print(userInputChar);
            }
            // Middle spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print(userInputChar);
                } else {
                    System.out.print(" ");
                }
            }
            // Right stars
            for (int j = 1; j <= userInput - i; j++) {
                System.out.print(userInputChar);
            }
            System.out.println();
        }

        scanner.close();
    }
}
