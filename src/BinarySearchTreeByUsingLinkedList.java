import java.util.*;
import java.io.*;
class BinarySearchTreeByUsingLinkedList {
    class Node {
        Node left;
        int val;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    class BST {
        Node root;
        BST()
        {
            root=null;
        }

        public void insert(int key) {
            Node node = new Node(key);
            if (root == null) {
                root = node;
                return;
            }
            Node prev = null;
            Node temp = root;
            while (temp != null) {
                if (temp.val > key) {
                    prev = temp;
                    temp = temp.left;
                } else if (temp.val < key) {
                    prev = temp;
                    temp = temp.right;
                }
            }
            if (prev.val > key)
                prev.left = node;
            else prev.right = node;
        }


//        public void inorder() {
//            Node temp = root;
//            Stack<Node> stack = new Stack<>();
//            while (temp != null || !stack.isEmpty()) {
//                if (temp != null) {
//                    stack.add(temp);
//                    temp = temp.left;
//                } else {
//                    temp = stack.pop();
//                    System.out.print(temp.val + " ");
//                    temp = temp.right;
//                }
//            }
//        }
        // inorder traversal by using recursion
        public  void InOrderTraversalTraversal(Node root)
        {
            if(root==null)
            {
                return;
            }
           // if(root.val>=30 && root.val<=60)
           // {
                //System.out.println(root.val+" ");
                InOrderTraversalTraversal(root.left);
                InOrderTraversalTraversal(root.right);
            System.out.println(root.val+" ");


            //}

        }

//        public void print(Node root)
//        {
//            if (root.val>=10)
//            {
//                if (root.val<=50) {
//                    System.out.println(root.val);
//                    if (root.left!=null)
//                    print(root.left);
//                    if (root.right!=null)
//                    print(root.right);
//                }
//            }
//        }

    }
}
class GFG {
    public static void main (String[] args) {
        BinarySearchTreeByUsingLinkedList obj=new BinarySearchTreeByUsingLinkedList();
        BinarySearchTreeByUsingLinkedList.BST tree=obj.new BST();
        tree.insert(30);
        tree.insert(50);
        tree.insert(15);
        tree.insert(20);
        tree.insert(10);
        tree.insert(40);
        tree.insert(60);
        //tree.inorder();
       tree.InOrderTraversalTraversal(tree.root);
        //tree.print(tree.root);
    }
}

