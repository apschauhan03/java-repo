
import java.util.Arrays;
import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
        // Taking the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word");
        char[] firstWord = scanner.next().toCharArray();
        System.out.println("Enter the second word");
        char[] secondWord = scanner.next().toCharArray();

        // Checking for anagram
        for (int i = 0; i < firstWord.length; i++) {
            for (int j = 0; j < secondWord.length; j++) {
                if (firstWord[i] == secondWord[j]) {
                    firstWord[i] = 'x';
                    secondWord[j] = 'x';
                }
            }
        }
        if (Arrays.equals(firstWord, secondWord))
            System.out.println("anagram");
        else
            System.out.println("not an anagram");
        scanner.close();

    }
}
