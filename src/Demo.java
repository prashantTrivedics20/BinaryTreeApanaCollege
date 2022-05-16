import java.util.*;
public class Demo {
    static class Node
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
    static class BinaryTree {
        static int index=-1;
        public static Node buildTree(int nodes[]) {
            index++;
            if(nodes[index]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;

        }
    }
    // preorderTraversal
    public static void preorder(Node root)
    {
        if(root==null)
        {
            //System.out.println(-1);
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    // in order traversal
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    // post order traversal
    public static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    // LevelOrderTraversal
    public static void LevelOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currentNode=q.remove();
            if(currentNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(currentNode.data+" ");
                if(currentNode.left!=null) {
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    q.add(currentNode.right);
                }

            }
        }

    }
    // count the node
    public static int count(Node root)
    {
        if(root==null)
        {
            return 0;
        }
       int leftNode= count(root.left);
       int rigthNode= count(root.right);
       return leftNode+rigthNode+1;
    }
    // sum of Nodes
    public static int sum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=sum(root.left);
        int right=sum(root.right);

        return left+right+root.data;
    }
    // height of the tree
    public static int  height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int myheight=Math.max(leftHeight,rightHeight)+1;
        return myheight;

    }
    // Diameter of a tree o(n^2)
    public static int diameter(Node root){
        if(root==null)
        {
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    // Diameter of a tree o(n)
    static class TreeInfo
    {
        int ht;
        int diam;
        TreeInfo(int ht,int diam)
        {
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root)
    {
        if(root==null)
        {

           return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myheight=Math.max(left.ht,right.ht)+1;
        int diam1= left.diam;
        int diam2=right.diam;
        int diam3= left.ht+right.ht+1;
        int mydiam=Math.max(diam3,Math.max(diam1,diam2));
        TreeInfo myinfo=new TreeInfo(mydiam,myheight);
        return myinfo;
    }

    public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            Demo.BinaryTree tree=new Demo.BinaryTree();
            Node root=tree.buildTree(nodes);
        //System.out.println(root.data);
        //preorder(root);
        //inorder(root);
       // postOrder(root);
        //LevelOrder(root);
        //System.out.println(count(root));
       // System.out.println(sum(root));
        //System.out.println(height(root));
       // System.out.println(diameter(root));
        //System.out.println(diameter2(root).diam);


        }

}
