class Program {
    public static int findClosestValueInBst(BST tree, int target) {
      
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
          return closest;
    }
  
    static class BST {
      public int value;
      public BST left;
      public BST right;
  
      public BST(int value) {
        this.value = value;
      }
    }
  }
  