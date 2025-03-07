import java.util.Arrays;

public class secondLargest {

    public static int method1(int array[]){
        int n=array.length;
        Arrays.sort(array);

        return array[n-2];
    }

    public static void method2(int array[]){
        int n=array.length;

        int small=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            small=Math.min(small,array[i]);
            large=Math.max(large,array[i]);
        }

        for(int i=0;i<n;i++){
            if(array[i]<secondsmall && array[i]!=small){
                secondsmall=array[i];
            }

            if(array[i]>secondlarge && array[i]!=large){
                secondlarge=array[i];
            }
        }

        System.out.println("Element is: "+secondlarge);

    }
    public static void main(String[] args) {
        int array[]={3,2,1,4,5,6};
        int max = method1(array);
        System.out.println("Second Largest: "+max);

        method2(array);
    }
}