import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        // Taking input
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String binary = "";

        // Finding and storing the binary of number
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }

        System.out.println("Binary: " + binary);
        scanner.close();
    }
}
