public class subsetAarray {
    public static boolean check(int array1[],int m, int array2[],int n){
        if(m>n){
            return false;
        }

        for(int i=0;i<m;i++){
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(array2[j]==array1[i]){
                    flag=true;
                    break;
                }
            }

            if(flag==false){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int array1[]={1,3,4,5,2};
        int array2[]={2,4,3,1,7,5,15};

        int m = array1.length;
        int n = array2.length;

        boolean ans = check(array1,m,array2,n);

        if(ans==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
