public class secondLargest {
    public static  int  findSecondLargest(int[] array) {
        int n = array.length;
        int largest = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        int second = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] != largest) {
                second = array[i];
                break;
            }
        }
        return second;
    }
    public static void main(String args[]) {
        int[] numbers = {1, 2, 3, 4, 5};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("Second largest element in the array is: " + secondLargest);
    }
}