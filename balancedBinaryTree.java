class TreeNode {
    int val;
    Node left;
    Node right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class balancedBinaryTree {

    public boolean isBalanced(Node root) {
        if(root==null) return true;

        int lh = height(root.left);
        int rh = height(root.right);

        lh++;
        rh++;

        int diff=lh-rh;

        if(diff<0){
            diff=(-diff);
        }

        if(diff>1){
            return false;
        }

        return (isBalanced(root.left) && isBalanced(root.right));
    }

    public int height(Node root) {
        if(root==null || (root.left==null && root.right==null)){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        balancedBinaryTree tree = new balancedBinaryTree();
        System.out.println(tree.isBalanced(root));
    }
}
