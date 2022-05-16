public class SearchingElementCode {
     //A utility function to search a given key in BST
    Node root;
    SearchingElementCode()
    {
        root =null;
    }
    class Node
     {
         int data;
         Node left;
         Node right;
         Node(int data)
         {
             this.data=data;
             this.left=null;
             this.right=null;
         }
     }
     public void insert(int value)
     {
         Node newNode=new Node(value);
         if(root==null)
         {
             root=newNode;
             return;
         }



















     }
    public Node search(Node root, int key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.data==key)
            return root;

        // Key is greater than root's key
        if (root.data < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }

    public static void main(String[] args) {


    }

}
