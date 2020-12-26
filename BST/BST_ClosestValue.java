class BST_ClosestValue {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    BST given_tree = new BST(6);
    given_tree.right = new BST(8);
    given_tree.right.left = new BST(7);
    given_tree.right.right = new BST(9);
    given_tree.left = new BST(4);
    given_tree.left.right = new BST(5);
    given_tree.left.left = new BST(1);

    findClosestValueInBst(given_tree, 2);
  }

  public static void findClosestValueInBst(BST tree, int target) {
    
        int closest = tree.value;
        while(tree != null){
            if (java.lang.Math.abs(target - tree.value) < java.lang.Math.abs(target - closest)) {
                      closest = tree.value;
                  }

            if (target > tree.value ){	
                tree = tree.right;
            } else {
                tree = tree.left;
            }
        }
        System.out.println(closest);
  }
}
  