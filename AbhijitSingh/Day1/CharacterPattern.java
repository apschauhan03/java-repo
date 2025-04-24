import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int height = scanner.nextInt();
        int width = 2 * height - 1;
        int mid = height / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Calculate the two sides of the A
                if (j == height - i - 1 || j == height + i - 1) {
                    System.out.print("*");
                }
                // Middle horizontal bar
                else if (i == mid && j > height - i - 1 && j < height + i - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
