public class countASubsetDiff {

    public int count(int[] arr, int diff) {

        int sum=0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }

        if((sum+diff)%2!=0){
            return 0;
        }

        int find = (sum+diff)/2;

        int dp[][] = new int[n+1][find+1];

        dp[0][0]=1;

        for(int i=1;i<=n;i++){
            for(int j=0;j<=find;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }


        return dp[n][find];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int diff = 1;

        countASubsetDiff solution = new countASubsetDiff();
        int result = solution.count(arr, diff);

        System.out.println("The number of subsets with the given difference is: " + result);
    }
}
