public class arrayQuestion12 {
    public int findMissing(int array[]){
        int n = array.length;
        int sumOfN=n*(n+1)/2;

        int sumOfArray = 0;
        for(int i=0;i<n-1;i++){
            sumOfArray=sumOfArray+array[i];
        }

        int rem = sumOfN-sumOfArray;

        return rem;
    }
    public static void main(String[] args) {
        arrayQuestion12 res  =new arrayQuestion12();
        int array[] = {1,2,3,5,6};
        int ans = res.findMissing(array);
        System.out.println(ans);

    }
}
