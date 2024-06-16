class Dnode{
    int data;
    Dnode left;
    Dnode right;
    Dnode(int Data){
        this.data=Data;
        right=left=null;
    }

}

public class doubly_linked_list {

    Dnode root;
    void create_list(){
        root=null;
    }
    void insert_left(int data){
        Dnode n=new Dnode(data);
        if(root==null){
            root=n;
        }
        else{
            n.right=root;
            root.left=n;
            root=n;

        }
    }
    void delete_left(){
        if(root==null){
            System.out.println("list is empty");
        }
        else {
            Dnode t=root;
            root=root.right;
            if(root!=null){
                root.left=null;
            }
            
            System.out.println("Deleted :"+t.data);

        }
    }
    void insert_right(int data){
        Dnode n=new Dnode(data);
        if(root==null){
            
            root=n;
            
        }

        else{
            Dnode t=root;
            while (t.right!=null) {
                t=t.right;
                
            }
            
            t.right=n;
            n.left=t;
        }

    }
    void delete_right(){
        Dnode t,t2;
        t=root;
        while(t.right!=null){
           
            t=t.right;
        }
        if(t==root)//only for single node
        {
            root=null;
        }
          
        else{
            t2=t.left;//3
            t2.right=null;//4`

            System.out.println("Deleted :"+t.data);

          }
    }
    void print(){
        if(root==null){
            System.out.println("Linked List is Empty ");
        }
        Dnode t=root;
        while(t!=null){
            System.out.print("|"+t.data +"|-->");
            t=t.right;
        }
    }
    void print_reverse(){
        if(root==null){
            System.out.println("Linked List is Empty ");
        }
        Dnode t=root;
        while(t.right!=null){
            
            t=t.right;
        }
        while(t!=null){
            System.out.print("|"+t.data +"|-->");
            t=t.left;
        }
    }
    
}
