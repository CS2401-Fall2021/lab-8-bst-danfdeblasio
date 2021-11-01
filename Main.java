public class Main {
  public static void main(String[] args) {
    String treeString="D(A(C)(A))(D(B))";
    Node root = TreeParser.treeFromString(treeString,0,treeString.length()-1);
    System.out.println("Mistakes should be 2, but is:"+numTreeMistakes(root));
    System.out.println("Depth should be 3, but is:"+treeDepth(root));
    System.out.println("Items should be 4, but is:"+treeItems(root));
    System.out.println("KeepTree should be true, but is:"+keepTree(root,2,3));
  }

  // Part 1: Calculate number of mistakes in a tree that starts at root.
  public static int numTreeMistakes(Node root){return numTreeMistakes(root, Character.MIN_VALUE, Character.MAX_VALUE);}
  public static int numTreeMistakes(Node root, char min, char max){
    if(root == null) return 0;
    int ct = (root.data > max || root.data < min)?1:0;
    ct += numTreeMistakes(root.left,min,root.data);
    ct += numTreeMistakes(root.right,root.data,max);
    return ct;
  }

  // Part 2: Calculate the maximum depth of the tree
  public static int treeDepth(Node root){
    if (root==null)return -1;
    int left = 
  }
  // Part 3: Calculate the number of unique values in the tree
  public static int treeItems(Node root){
    return -1;
  }
  // Part 4: Quality control! Combine parts 1-3 to see if we can keep the tree
  public static boolean keepTree(Node root, int maxMistakes, double logFactor){
    return false;
  }
}