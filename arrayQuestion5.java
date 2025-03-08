public class arrayQuestion5 {
    static void moveArray(int array[]){
        int temp = array[0];
        for(int i=0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=temp;

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");;
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        moveArray(array);
    }
}
