package datastructure.tree;

public class BinaryTree {
    
    private TreeNode root = null;
    
    public BinaryTree(int key) {
        root = new TreeNode(key);
    }
    
    public void createRandomTree() {
        TreeNode node1 = new TreeNode(3);
    }
    
    private class TreeNode {
        private int key = 0;
        private TreeNode leftChild = null;
        private TreeNode rightChild = null;
        
        public TreeNode() {}
        
        public TreeNode(int key) {
            this.key = key;
        }
    }
    
    

}
