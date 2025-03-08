class Node {
    int val;
    Node left;
    Node right;

    Node(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class SameTree {

    public boolean isSameTree(Node p, Node q) {
        if(p==null || q==null){
            return p==q;
        }

        if(p==null && q==null){
            return true;
        }

        if(p.val!=q.val) return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        q.left = new Node(4);
        q.right = new Node(3);

        SameTree treeChecker = new SameTree();
        System.out.println(treeChecker.isSameTree(p, q)); // Placeholder for actual output
    }
}
