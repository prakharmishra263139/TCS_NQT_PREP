import java.util.List;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class ArrayToLinkedList {

    static ListNode convertArrayToLinkedList(int[] array) {

        if(array.length==0){
            return null;
        }

        ListNode head = new ListNode(array[0]);
        ListNode temp = head;

        for(int i=1;i<array.length;i++){
            temp.next= new ListNode(array[i]);
            temp = temp.next;
        }
        return head; // Placeholder return value
    }

    static  int lengthofLL(ListNode head){
        ListNode temp = head;
        int length=0;

        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    static boolean searchLL(ListNode head, int data){
        ListNode temp = head;

        while(temp!=null){
            if(temp.val==data){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6,7,8,9,10}; // Example array

        ListNode head = convertArrayToLinkedList(array);
        printLinkedList(head);

        System.out.println(lengthofLL(head));
        System.out.println(searchLL(head,2));
    }
}
