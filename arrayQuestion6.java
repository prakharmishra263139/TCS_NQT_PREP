public class arrayQuestion6 {

    static void leftRotateByD(int[] array, int n, int d) {
        if (n == 0) {
            return;
        }

        d = d % n; // Handle cases where d >= n

        if (d == 0) {
            return;
        }

        int[] ans = new int[d];

        for (int i = 0; i < d; i++) {
            ans[i] = array[i];
        }

        for (int i = d; i < n; i++) {
            array[i - d] = array[i];
        }

        for (int i = 0; i < d; i++) {
            array[n - d + i] = ans[i];
        }
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void reverse(int array[], int start, int end){
        while(start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }

    static void leftRotate(int array[], int n, int d){
        if(n==0){
            return;
        }

        d=d%n;

        reverse(array,0,d-1);
        reverse(array,d,n-1);
        reverse(array,0,n-1);

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int d = 3;
        int n = array.length;

        /*System.out.print("Original Array: ");
        display(array);

        leftRotateByD(array, n, d);

        System.out.print("Array after left rotation by " + d + " places: ");
        display(array);*/

        leftRotate(array,7,3);
        display(array);
    }
}
