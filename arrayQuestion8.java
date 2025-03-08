public class arrayQuestion8 {

    public static int[] moveZeros(int array[], int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(array[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1){
            return array;
        }

        for(int i=j+1;i<n;i++){
            if(array[i]!=0){
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
                j++;
            }
        }

        return array;
    }
    public static void main(String[] args) {
        int array[] = {1,0,2,3,2,0,0,4,5,1};
        int n=10;
        int ans[]= moveZeros(array,n);


        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
}
