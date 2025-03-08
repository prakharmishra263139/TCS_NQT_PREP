public class implementationLL {
    static  class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=next;
        }
    }

    public static class linkedList {
        Node head=null;
        Node tail=null;

        void inserAtBegin(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }

        void inserAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }




       public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }



    }
    public static void main(String[] args) {
        linkedList ll  = new linkedList();
        ll.inserAtBegin(1);
        ll.inserAtBegin(2);
        ll.inserAtBegin(3);
        ll.inserAtBegin(4);
        ll.inserAtBegin(5);

        ll.display();
        ll.inserAtEnd(99);
        ll.display();
    }
}
