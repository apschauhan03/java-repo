import java.util.ArrayList;

class Calculator {
    public int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer value : arr) {
            System.out.print(value + " ");
            sum += value;
        }
        System.out.println();
        arr.set(2, 8);
        return sum;
    }
}

public class Rough {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = arr;
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr1.set(1, 100);
        // Calculator calc = new Calculator();
        // int sum = calc.sum(arr);

        // System.out.println(sum);
        // System.out.println(arr.get(2));
        // arr.remove(1);

        System.out.println(arr.get(1));
    }
}
