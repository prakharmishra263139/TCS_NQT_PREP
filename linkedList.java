public class linkedList {
    static class Node {
        public int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // Ensure the 'next' pointer is initialized to null
        }
    }

    public static class linkList {
        Node head = null;
        Node tail = null;

        void insertATEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtbegin(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        public static Node deleteAtKth(Node head, int k) {
            if (head == null) {
                return head;
            }

            if (k == 1) {
                return head.next; // Return the second node as the first node is being deleted
            }

            int count = 1; // Start count at 1 to match the position
            Node temp = head;
            Node prev = null;

            while (temp != null && count < k) {
                prev = temp;
                temp = temp.next;
                count++;
            }

            if (temp != null && prev != null) {
                prev.next = temp.next;
            }

            return head;
        }

        public static Node removeEle(Node head, int val) {
            if (head == null) {
                return head;
            }

            if (head.data == val) {
                Node temp = head;
                head=head.next;
                return head;
            }

           // Start count at 1 to match the position
            Node temp = head;
            Node prev = null;

            while(temp!=null){
                if(temp.data==val){
                    prev.next=temp.next;
                    break;
                }
                prev=temp;
                temp=temp.next;
            }

            return head;
        }

        void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkList ll = new linkList();
        ll.insertAtbegin(1);
        ll.insertAtbegin(2);
        ll.insertAtbegin(3);
        ll.insertAtbegin(4);
        ll.insertAtbegin(5);
        ll.insertAtbegin(6);

        System.out.println("Original List:");
        ll.display();

        ll.head = linkList.deleteAtKth(ll.head, 3); // Delete the 3rd node

        System.out.println("List after deleting 3rd node:");
        ll.display();

        ll.head=linkList.removeEle(ll.head,2);
        ll.display();

    }
}
