public class sumArray {
    //Calculate Sum of the Elements of the Array
    public static int solve(int array[]){
        int n=array.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};
        System.out.println(solve(array));
    }
}
