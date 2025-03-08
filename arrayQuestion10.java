import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayQuestion10 {
        static int[] intersectionOfArrays(int[] array1, int[] array2) {

            ArrayList<Integer> list =new ArrayList<>();
            int i=0;
            int j=0;

           while(i<array1.length && j<array2.length){
               if(array1[i]<array2[j]){
                   i++;
               }else if(array1[i]>array2[j]){
                   j++;
               }else{
                   list.add(array1[i]);
                   i++;
                   j++;
               }
           }

           int arr[] = new int[list.size()];


           for(int index=0;index< list.size();index++){
               arr[index] = list.get(index);
           }

            return arr; // Placeholder return value
        }

        public static void display(int[] array) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] array1 = {1, 2, 4, 5}; // Example sorted array 1
            int[] array2 = {2, 3, 5, 6}; // Example sorted array 2

            System.out.print("Array 1: ");
            display(array1);
            System.out.print("Array 2: ");
            display(array2);

            int[] intersectionArray = intersectionOfArrays(array1, array2);

            System.out.print("Intersection of arrays: ");
            display(intersectionArray);
        }
    }


