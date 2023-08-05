
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            //swaping left and right nodes
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            
            //Recurssively calling left and right nodes.
            invertTree(root.right);
            invertTree(root.left);
        }
        return root;
    }
}