import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayQuestion11 {
    static int[] unionOfArrays(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();

        for (int value : array1) {
            set.add(value);
        }

        for (int value : array2) {
            set.add(value);
        }

        int[] unionArray = new int[set.size()];

        int index = 0;
        for (int value : set) {
            unionArray[index++] = value;
        }

        return unionArray;
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5}; // Example sorted array 1
        int[] array2 = {2, 3, 5, 6}; // Example sorted array 2

        System.out.print("Array 1: ");
        display(array1);
        System.out.print("Array 2: ");
        display(array2);

        int[] unionArray = unionOfArrays(array1, array2);

        System.out.print("Union of arrays: ");
        display(unionArray);
    }
}
