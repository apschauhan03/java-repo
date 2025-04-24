import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        // Taking input
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0;

        // Printing next 5 prime numbers
        while (count < 5) {
            if (num % 2 != 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        scanner.close();
    }
}
