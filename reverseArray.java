public class reverseArray {
    public static void solve(int array[]) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int array[]) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};

        System.out.println("Original Array: ");
        printArray(array);

        solve(array);

        System.out.println("Reversed Array: ");
        printArray(array);
    }
}
