
import java.util.*;
class Dnode{
    Dnode left,right;
    int data;
    Dnode(int data){
        this.data=data;
        
    }
}
public class Binary_Tree
{
    Dnode root;
    void init_tree()
    {
        root=null;
    }
    void insert(Dnode r,Dnode n)//r:root as ref and    n:new node to insert
                   //100   150
    {
        if(root==null)
            root=n;
        else//tree exists
        {
            if(n.data<r.data)//if lesser:left
            {  if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else// right
            {  if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);

            }
        }

    }
    void inorder(Dnode r)
    {
        if(r!=null)
        {
         inorder(r.left);// L
         System.out.print(r.data+",");// P 50 100 150
         inorder(r.right);   // R
        }
    }
    void preorder(Dnode r)
    {
        if(r!=null)
        {
        System.out.print(r.data+",");// P 50 100 150
        preorder(r.left);// L
         
        preorder(r.right);   // R
        }
    }
    boolean search(Dnode r,int key)
    {
        boolean left,right;
        if(r==null)
            return false;
        else
        {
            if(r.data==key)
                return true;
            else {
                left = search(r.left, key);
                right = search(r.right, key);
                return left || right;
            }
        }
    }
    int count(Dnode r)
    {
        int left,right;
        if(r==null)
            return 0;
        else
        {
            
                left = count(r.left);
                right = count(r.right);

                return left + right+1;
            
        }
    }
    int Depth(Dnode r)
    {
        int left,right;
        if(r==null)
            return 0;
        else
        {
            
                left = Depth(r.left);
                right = Depth(r.right);

                return Math.max(left, right)+1;
            
        }
    }
    int ifBalance(Dnode r)
    {
        int left,right;
        if(r==null)
            return 0;
        else
        {
            
                left = ifBalance(r.left);
                right = ifBalance(r.right);

                return left - right+1;
            
        }
    }





    public static void main(String args[]) {
        int ch,e;
        Scanner in = new Scanner(System.in);
        Binary_Tree obj = new Binary_Tree();
        obj.init_tree();
        do {
            System.out.println("\n1.Insert\n2.Inorder\n3.Search\n4.Count\n5.Depth\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    Dnode n=new Dnode(e);//n(150)
                    obj.insert(obj.root,n);//insert((100),n(150))
                    System.out.println("Data to inserted");
                    break;
                case 2:
                    System.out.println("Data in inorder:");
                    obj.inorder(obj.root);//inorder(root:100)
                    break;
                case 3:
                    System.out.println("Enter data to search:");
                    e = in.nextInt();
                    System.out.println(e+" Found in tree:"+ obj.search(obj.root,e));
                    break;
                case 4:
                   
                    System.out.println(" count:"+ obj.count(obj.root));
                    break;
                case 5:
                   
                    System.out.println(" Depth:"+ (obj.Depth(obj.root)-1));
                    break;
                case 6:
                   int k=obj.ifBalance(obj.root);
                   if(k<=1&&k>=-1){
                    System.out.println(" tree is balance :");

                   }
                   else{
                    System.out.println(" tree is not balance :");
                   }
                    
                    break;
                case 7:
                    System.out.println("Data in inorder:");
                    obj.preorder(obj.root);
                    break;
                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
    }
}






