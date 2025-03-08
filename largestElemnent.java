
public class largestElemnent {

    public static int findLargest(int[] array) {
        int n = array.length;
        int largest = array[0];

        for(int i=1;i<n;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }

        return largest;
    }

    public static  int findLargestBetter(int[] array){
        int n = array.length;
        int largest = array[0];
        for(int i=1;i<n;i++){
            largest = Math.max(largest, array[i]);
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int largest = findLargest(numbers);
        System.out.println("Largest element in the array is: " + largest);

        int ans  = findLargestBetter(numbers);
        System.out.println(ans);

    }
}