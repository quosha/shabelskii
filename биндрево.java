class BinaryTreeNode{
    int value;
    BinaryTreeNode left;
     BinaryTreeNode right;
     BinaryTreeNode(int value) {
         this.value = value;
         left = null;
         right = null;
     }
}
public class BinaryTree {
    public static void insertNode(BinaryTreeNode root,int value){
        BinaryTreeNode current = root;
        while (true){
            if(value < current.value){
                if(current.left == null){
                    current.left = new BinaryTreeNode(value);
                    break;
                } else{
                    current = current.left;
                }
            }else{
                if(current.right == null){
                    current.right = new BinaryTreeNode(value);
                    break;
                }else{
                    current = current.right;
                }
            }
        }
    }
    public static BinaryTreeNode createBinaryTree(int[] values){
        BinaryTreeNode root = new BinaryTreeNode(values[0]);
        for(int i = 1; i<values.length; i++){
            insertNode(root,values[i]);
        }
        return root;
    }
    public static void printBinaryTree(BinaryTreeNode root){
        if (root == null) return;
        printBinaryTree(root.left);
        System.out.println(root.value);
        printBinaryTree(root.right);
    }
    public static void main(String[] args){
        int[] values = {10,5,15,2,7,12,17};
        BinaryTreeNode root = createBinaryTree(values);
        printBinaryTree(root);
    }
}
