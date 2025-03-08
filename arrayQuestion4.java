import java.util.Arrays;

public class arrayQuestion4 {
    static int[] leftRotateByOne(int[] array) {
        int n = array.length;
        int[] newArray = new int[n];

        for(int i = 1; i < n; i++) {
            newArray[i - 1] = array[i];
        }
        newArray[n - 1] = array[0];
        return newArray;
    }
    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Original Array: ");
        display(array);

        int[] rotatedArray = leftRotateByOne(array);
        System.out.print("Array after left rotation: ");
        display(rotatedArray);
    }
}
