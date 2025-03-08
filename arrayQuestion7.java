import java.util.List;

import java.util.*;
public class arrayQuestion7 {

    static void moveZerosToEnd(int[] array) {
        // Placeholder for main logic

       ArrayList<Integer>list = new ArrayList<>();

       for(int i=0;i<array.length;i++){
           if(array[i]!=0){
               list.add(array[i]);
           }
       }

       int nonZero = list.size();
       for(int i=0;i<nonZero;i++){
           array[i]=list.get(i);
       }

       for(int i=nonZero;i<array.length;i++){
           array[i]=0;
       }
    }


    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12}; // Example array
        System.out.print("Original Array: ");
        display(array);

        moveZerosToEnd(array);

        System.out.print("Array after moving zeros to the end: ");
        display(array);
    }
}
