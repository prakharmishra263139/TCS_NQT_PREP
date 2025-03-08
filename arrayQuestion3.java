public class arrayQuestion3 {
    static boolean brute(int[] array) {
        // Placeholder for main logic
        int n = array.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(array[i]<array[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean better(int array[]){
        int n = array.length;
        for(int i=1;i<n;i++){
            if(array[i]<array[i-1]){
                return  false;
            }
        }
        return true;
    }

    public static boolean optimal(int array[]){
        int n =array.length;

        for(int i=1;i<n;i++){
            if(array[i]>array[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array

        boolean sorted = brute(array);
        System.out.println("The array is sorted: " + sorted);

        boolean sortedBetter= brute(array);
        System.out.println("The array is sorted: " + sortedBetter);

        boolean sortedOptimal = optimal(array);
        System.out.println("The array is sorted: " + sortedOptimal);
    }
}
