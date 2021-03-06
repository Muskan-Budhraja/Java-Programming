import java.util.*;
public class BinarySearchTree
{
	//To create a node
	static class Node{
	    int data;
	    Node left; 
	    Node right;
	    Node(int d)
	    {
	        data=d;
	        left=null;
	        right=null;
	    }
	}
	//Tree class is perform all tasks related to tree
	static class Tree{
	    Node root;
	    int sum=0;
	    void insert(int data) //function to insert a node
	    {
	        Node temp=new Node(data);
	        if(root==null) root= temp; //Check if the tree is empty, if yes then create the new node as the root 
	        else{
	             Node t=root;
	             while(true){           //loop runs until we find a position to insert the node
	                 if(data<t.data)   //if data is less than the root go to the left node
    	             {
    	                 if(t.left==null) //if left node is empty add the node to the left
    	                 {
    	                     t.left=temp;
    	                     break;
    	                 }
    	                 else t=t.left;   //else move to the left
    	             }
    	             else           //else go to right node        
    	             {
    	                 if(t.right==null) //if right node is empty add the node to the right
    	                 {
    	                     t.right=temp;
    	                     break;
    	                 }
    	                 else t=t.right; //else go to the right node
    	             }
	             }
	             
	        }
	    }
	    void inorder(Node node)   //funtion for inorder traversal of BST
	    {
	        if(node==null)
	        return;
	        inorder(node.left);
	        System.out.print(node.data+"  ");
	        inorder(node.right);
	    }
	    void display()             //helper function to display the nodes
	    {
	        inorder(root);
	    }
	    void calc(Node node)       //function to calculate the sum of the nodes
	    {
	        if(node==null)
	        return;
	        calc(node.left);
	        sum+=node.data;
	        calc(node.right);
	    }
	    int Sum()                 //helper function to return the sum of the nodes
	    {
	        calc(root);
	        return sum;
	    }
	    boolean search(int data)   //function to search the BST for a node
	    {
	       if(root==null) return false;
	       Node t= root;
	       while(t!=null)          //loop runs until we reach the end of the tree 
	       {
	           if(t.data==data) return true; //if data is found in the node return true
	           else if(data<t.data)     
	             {
	                   else t=t.left;                        //else go to left node
	             }
	             else
	             {
	                  t=t.right;                        //else go to the right node
	             }
            }
            return false;
	    }
	    
	}
	public static void main(String[] args)
	{
	    Tree tree=new Tree();
	    tree.insert(13);
	    tree.insert(11);
	    tree.insert(12);
	    tree.insert(42);
	    tree.insert(22);
	    tree.insert(15);
	    tree.insert(10);
	    tree.display();
	    System.out.println("Sum of nodes = "+ tree.Sum());
	    int data= 42;
	    System.out.println("Find the node "+data+"  " + tree.search(data));
	    
	    
	}

}
