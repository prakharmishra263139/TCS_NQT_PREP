import java.util.Arrays;

public class arrayQuestion1 {
    /*max array can store is 10^6 inside main method
    and in global it is 10^7*/
    static int findLargestElement(int[] array) {
        int maxNum=array[0];
        int n = array.length;

        for(int i=0;i<n;i++){
            if(array[i]>maxNum){
                maxNum=array[i];
            }
        }
        return maxNum;
    }

    static int brute(int array[]){
        int n = array.length;
         Arrays.sort(array);
        return array[n-1];

    }
    public static void main(String[] args) {
        int[] array = {12, 24, 5, 79, 3, 18}; // Example array
        int largest = findLargestElement(array);
        System.out.println("The largest element in the array is: " + largest);

        System.out.println("Brute "+brute(array));
    }
}
