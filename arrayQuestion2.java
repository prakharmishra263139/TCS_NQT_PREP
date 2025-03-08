import java.util.Arrays;
public class arrayQuestion2 {

    static int findSecondLargestElement(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
}
    public static int brute(int array[]){
        int n=array.length;
        Arrays.sort(array);
        return array[n-2];
    }

    public static int better(int array[]){
        int n = array.length;

        int largest = array[0];
        for(int i=0;i<n;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }

        int sLargest=-1;

        for(int i=0;i<n;i++){
            if(array[i]>sLargest && array[i]!=largest){
                sLargest=array[i];
            }
        }

        return sLargest;

    }

    public static void main(String[] args) {
        int[] array = {1,2,4,7,7,5}; // Example array

        int secondLargest = findSecondLargestElement(array);
        System.out.println(secondLargest);
    }
}
