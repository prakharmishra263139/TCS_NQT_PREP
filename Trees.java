public class Trees {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
           this.data=data;
        }
    }

    public static void display(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+"->");
        if(root.left!=null)
            System.out.print(root.left.data+"->");

        if(root.right!=null)
            System.out.println(root.right.data+"->");

        System.out.println();
        display(root.left);
        display(root.right);
    }


    public static int sizeOfBT(Node root){
        if(root==null){
            return 0;
        }
        return sizeOfBT(root.left)+sizeOfBT(root.right)+1;
    }


    public static int sumTree(Node root){
        if(root==null){
            return 0;
        }
        int leftData = sumTree(root.left);
        int rightData = sumTree(root.right);

        return leftData+rightData+root.data;
    }


    public static int maxNode(Node root){
        if(root==null) return 0;

        int left = maxNode(root.left);
        int right = maxNode(root.right);

        return Math.max(left,Math.max(root.data,right));
    }

    public static int height(Node root){
        if(root==null) return 0;

        if(root.left==null && root.right==null) return 0;

        return Math.max(height(root.left),height(root.left))+1;
    }

    public static void levelOrder(Node root, int n){
        if(root==null){
            return ;
        }
        if(n==1){
            System.out.print(root.data+" ");
        }

        levelOrder(root.left,n-1);
        levelOrder(root.right,n-1);
    }

    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return ;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);

    }

    public static void main(String[] args) {
        Node root  =new Node(1);

        Node a  = new Node(2);
        Node b  = new Node(3);

        root.left=a;
        root.right=b;

        Node c  = new Node(4);
        Node d = new Node(5);

        a.left=c;
        a.right=d;

        Node e = new Node(6);
        Node f = new Node(7);

        b.left = e;
        b.right = f;

        //display(root);

        //System.out.println(sizeOfBT(root));

        //System.out.println(sumTree(root));

        //System.out.println(maxNode(root));

        /*preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);*/

        //System.out.println(height(root));

        int level=height(root)+1;

        for(int i=1;i<=level;i++){
            levelOrder(root,i);
        }
    }
}
