public class quickSort {
    public static void sort(int array[],int low, int high){
        if(low<high){
            int pivot = partition(array,low,high);
            sort(array,low,pivot-1);
            sort(array,pivot+1,high);
        }
    }

    public static int partition(int array[],int low, int high){
        int pivot = array[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(array[j]<pivot){
                i++;
                swap(array,i,j);
            }
        }
        swap(array,i+1,high);
        return i+1;

    }

    public static void swap(int array[],int i, int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void main(String[] args) {
        int array[] = {9,8,7,6,5,4,3,2,1};
        int n=array.length;
        sort(array,0,n-1);

        for(int num:array){
            System.out.print(num+" ");
        }
    }
}
