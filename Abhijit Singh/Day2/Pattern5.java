
import java.util.Scanner;

public class Pattern5 {
    // Algorithm for sorting the array
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Taking the input
        int[] arr = { 1, 3, 2, 9, 5 };
        Scanner scanner = new Scanner(System.in);
        int nthNumber = scanner.nextInt();
        sort(arr);

        // Nth largest
        System.out.println(arr[nthNumber - 1]);
        scanner.close();
    }
}
