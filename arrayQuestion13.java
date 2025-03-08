public class arrayQuestion13 {

    public int countConsecutive(int array[]){
        int n = array.length;
        int count=0;
        int cons=0;

        for(int i=0;i<n;i++){
            if(array[i]==1){
                count ++;
                cons = Math.max(cons,count);
            }else{
                count=0;
            }
        }
        return cons;
    }
    public static void main(String[] args) {
            arrayQuestion13 solution = new arrayQuestion13();

            int[] array = {1, 0, 1, 1, 0, 1}; // Example input
            int result = solution.countConsecutive(array);

            System.out.println("Maximum Consecutive Ones: " + result);  // Output: 2
        }
    }

