public class dpEqualSumPartition {

    boolean equalSum(int array[], int target, int n) {
        int sum1 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += array[i];
        }

        if (sum1 % 2 != 0) return false;

        return canPartition(array, sum1 / 2, n);
    }

    boolean canPartition(int arr[], int sum, int N) {
        boolean[][] dp = new boolean[N + 1][sum + 1];

        for (int i = 0; i <= N; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][sum];
    }

    public static void main(String[] args) {
        dpEqualSumPartition es = new dpEqualSumPartition();

        int array[] = {1, 5, 11, 5};
        int n = array.length;
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        boolean res = es.equalSum(array, sum, n);
        System.out.println(res);
    }
}
