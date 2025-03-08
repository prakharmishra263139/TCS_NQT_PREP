import java.util.*;

public class treeBFS {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static int diam(Node root){

        if(root==null){
            return 0;
        }

        int left = diam(root.left);
        int right = diam(root.right);

        return Math.max(left,right)+1;
    }

    public static void bfs(Node root){
        // Iterative way for BFS
        Queue<Node> q = new LinkedList<>();

        if (root != null) q.add(root);

        while (q.size()>0){
            Node temp = q.poll();

            if (temp.left != null) {
                q.add(temp.left);
            }

            if (temp.right != null) {
                q.add(temp.right);
            }

            System.out.print(temp.data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        Node a = new Node(2);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);

        a.left = c;
        a.right = d;

        Node e = new Node(6);
        Node f = new Node(7);

        b.left = e;
        b.right = f;


        //bfs(root);
        System.out.println(diam(root));
    }
}
