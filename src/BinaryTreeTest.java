import java.util.Scanner;
import java.util.*;
public class BinaryTreeTest {
    static Node root=null;
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data )
        {
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    static void insert(Node temp, int key)
    {

        if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            }
            else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }
    public static boolean check(Node root)
    {

        if(root.data==root.left.data+root.right.data)
        {
            return true;
        }
        else
        {
            return false;
        }




////
  }
  public static void display(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        display(root.left);
        display(root.right);

    }

    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=readme.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
           insert(root,arr[i]);
        }
        boolean b=check(root);
        System.out.println(b);
        display(root);

    }
}
