
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr1.add(1);
        arr1.add(4);
        arr.addAll(arr1);
        // arr.removeAll(arr1);
        // arr.remove(1);
        // System.out.println(arr.contains(1));
        // Iterator<Integer> it = arr.iterator();

        // while (it.hasNext()) {
        // System.out.print(it.next()+" ");
        // }
        // List<Integer> subArrayList = arr.subList(2, 4);
        // subArrayList.forEach((n)->System.out.println(n));

        ArrayList<ArrayList<Integer>> twoDArray = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(2);
        twoDArray.add(row);

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(3);
        row1.add(4);
        twoDArray.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(6);
        twoDArray.add(row2);

        System.out.println(twoDArray);
        System.out.println(twoDArray.indexOf(row2));

        for (ArrayList<Integer> arr4 : twoDArray) {
            if (arr4.equals(row2)) {
                System.out.println("Found Array : " + arr4);
            }
        }
    }
}
