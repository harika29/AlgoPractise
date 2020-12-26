class Node {
    public int value;
    public Node right, left;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BST_LowestCommonAncestor {

    Node root;

    public static void main(String args[]) {
        BST_LowestCommonAncestor given_tree = new BST_LowestCommonAncestor();
        given_tree.root = new Node(20);
        given_tree.root.right = new Node(22);
        given_tree.root.left = new Node(8);
        given_tree.root.left.left = new Node(4);
        given_tree.root.left.right = new Node(12);
        given_tree.root.left.right.right = new Node(14);
        given_tree.root.left.right.left = new Node(10);
        
        int val1 = 10, val2 = 13;
        int arr[] = numSort(val1, val2);
        int result = given_tree.lowestCommonAncestor(given_tree.root, arr[0], arr[1]);
        System.out.println("LCA of " + arr[0] + " and " + arr[1] + " is: " + result);

        val1 = 10; val2 = 14;
        arr = numSort(val1, val2);
        result = given_tree.lowestCommonAncestor(given_tree.root, arr[0], arr[1]);
        System.out.println("LCA of " + arr[0] + " and " + arr[1] + " is: " + result);

        val1 = 8; val2 = 14;
        arr = numSort(val1, val2);
        result = given_tree.lowestCommonAncestor(given_tree.root, arr[0], arr[1]);
        System.out.println("LCA of " + arr[0] + " and " + arr[1] + " is: " + result);

        val1 = 10; val2 = 22;
        arr = numSort(val1, val2);
        result = given_tree.lowestCommonAncestor(given_tree.root, arr[0], arr[1]);
        System.out.println("LCA of " + arr[0] + " and " + arr[1] + " is: " + result);

    }

    public static int[] numSort(int val1, int val2) {
        if(val1 > val2) {
            return new int[]{val2, val1};
        }
        return new int[]{val1, val2};
    }

    public int lowestCommonAncestor(Node node, int val1, int val2) {
        if (node == null) {
            return -1;
        }
        if (val1 == val2) {
            return val1;
        }
        if (val1> node.value && val2 > node.value) {
            return lowestCommonAncestor(node.right, val1, val2);
        } 
        if (val1 < node.value && val2 < node.value) {
            return lowestCommonAncestor(node.left, val1, val2);
        }
        if ((node.value == val1 && node.right != null && ifValueExistsInTree(node.right, val2)) || 
            (node.value == val2 && node.left != null && ifValueExistsInTree(node.left, val1)) ||
            (ifValueExistsInTree(node.left, val1) && ifValueExistsInTree(node.right, val2))) {
                return node.value;
        }
        return -1;
    }

    public static boolean ifValueExistsInTree(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        } else if (value > node.value) {
            return ifValueExistsInTree(node.right, value);
        } else {
            return ifValueExistsInTree(node.left, value);
        }
    }
    
}
