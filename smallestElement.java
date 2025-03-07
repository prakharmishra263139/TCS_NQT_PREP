import java.util.Arrays;

public class smallestElement {
    public static int findSmallestElement(int[] arr) {
        int  n = arr.length;

        Arrays.sort(arr);

        return arr[0];
    }

    public static int findSmall(int aray[]){
        int n=aray.length;

        int min=aray[0];

        for(int i=0;i<n;i++){
            if(aray[i]<min){
                min=aray[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {2,5,1,3,0};
        int small = findSmallestElement(array);
        System.out.println("Smallest element: " + small);
        int aray[]={5,4,3,2,1};
        int smallest = findSmall(aray);
        System.out.println("Smallest: "+smallest);
    }
}
