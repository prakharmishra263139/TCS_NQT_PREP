public class searchElement {
    public static int find(int array[],int target) {
        int n=array.length;
        int index=-1;

        for(int i=0;i<n;i++){
            if(array[i]==target){
                index=i;
                break;
            }
        }

        return index;
    }
    public static void main(String[] args) {

        int array[]={7,5,4,3,2,1};
        int target=1;

        System.out.println(find(array,target));

    }
}
