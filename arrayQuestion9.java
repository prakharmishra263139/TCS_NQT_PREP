public class arrayQuestion9 {
        static int linearSearch(int[] array, int target) {
            int n=array.length;

            for(int i=0;i<n;i++){
                if(array[i]==target){
                    return i;
                }
            }
            return -1; // Return -1 if element is not found
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5}; // Example array
            int target = 3; // Example target element

            int result = linearSearch(array, target);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    }
