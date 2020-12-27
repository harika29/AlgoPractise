public class DFS_Recursion {
    static class Node {
        int value;
        Node right, left;
    
        Node(int value) {
            this.value = value;
            right = left = null;
        }
    }

    Node root;

    public static void main(String[] args) {
        DFS_Recursion tree = new DFS_Recursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("InOrder DFS Traversal");
        tree.inOrder_DFS(tree.root);
        System.out.println("\n PreOrder DFS Traversal");
        tree.preOrder_DFS(tree.root);
        System.out.println("\n PostOrder DFS Traversal");
        tree.postOrder_DFS(tree.root);
    }

    public void inOrder_DFS(Node node) {
        if (node == null) {
            return;
        }
        inOrder_DFS(node.left);
        System.out.println(node.value);
        inOrder_DFS(node.right);
    }

    public void preOrder_DFS(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        preOrder_DFS(node.left);
        preOrder_DFS(node.right);
    }

    public void postOrder_DFS(Node node) {
        if (node == null) {
            return;
        }
        postOrder_DFS(node.left);
        postOrder_DFS(node.right);
        System.out.println(node.value);
    }
    
}
