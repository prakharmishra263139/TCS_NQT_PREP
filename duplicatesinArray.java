import java.util.*;
import java.util.Arrays;
import java.util.HashSet;

public class duplicatesinArray {

    public static class duplicatesInArray {

        static int removeDuplicates(int[] array) {
            int n = array.length;

            HashSet<Integer> hp = new HashSet<>();

            for(int data:array){
                hp.add(data);
            }

            int ans[] =new int[hp.size()];
            int index=0;

            for(int val : hp){
                ans[index++]=val;
            }
            int nm = ans.length;
            return nm;

        }

        static int checkUnique(int array[]){
            int n = array.length;
            int i=0;
            for(int j=1;j<n;j++){
                if(array[j]!=array[i]){
                    array[i+1]=array[j];
                    i++;
                }
            }

            return i+1;
        }

        public static void main(String[] args) {
            int[] array = {1,2,2,3,3,3,4,4,5}; // Example array
            int result = removeDuplicates(array);
            int answer = checkUnique(array);
            System.out.println("Array without duplicates amd size is: " + result);
            System.out.println(answer);
        }
    }
}
