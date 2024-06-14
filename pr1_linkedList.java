
import java.util.Scanner;

 class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }


    
}

public class pr1_linkedList {
    Node root;
    void create_list(){
        root=null;
    }
    void insert_left(int data){
        Node n=new Node(data);
        n.next=root;
        
        root=n;
    }
    void delete_left(){
        if(root==null){
            System.out.println("list is empty");
        }
        else {
            Node t=root;
            root=root.next;
            System.out.println("Deleted :"+t.data);

        }
    }

    void insert_right(int data){
        if(root==null){
            Node n=new Node(data);
            root=n;
            
        }
        else{
            Node t=root;
            while (t.next!=null) {
                t=t.next;
            }
            Node n=new Node(data);
            t.next=n;
            

        }

    }
    void delete_right(){
        Node t,t2;
        t=t2=root;
        while(t.next!=null){
            t2=t;
            t=t.next;
        }
        t2.next=null;
          System.out.println("Deleted :"+t.data);
    }
    void print(){
        if(root==null){
            System.out.println("Linked List is Empty ");
        }
        Node t=root;
        while(t!=null){
            System.out.print("|"+t.data +"|-->");
            t=t.next;
        }
    }
    void search(int key){
        Node t=root;
        while(t!=null && t.data!=key){
           
            t=t.next;
        }
        if(t.data== key){
            System.out.println(key+"Element is found");

        }
        else {
            System.out.println(key+"Element is not found");

        }
    }
    void delete(int data){
        Node t,t1;
        t1=t=root;
        while(t!=null&&t.data!=data){
            t1=t;
            t=t.next;

        }
        if(t==null){
            System.out.println("element not found for delete :");
        }
        else {
            if(t==root){
            root=root.next;
        }
        else if(t.next==null)
        {
            t1.next=null;
        }
        else
        {
           t1.next=t.next;
        }
    }
}
    void insertAt(int data,int pos){
        Node t,t1;
        t=t1=root;
        if(pos==0)
        {
            Node n=new Node(data);
            n.next=root;
            root=n;
            root.next=null;
            System.out.println("0");
        }
        else{
            Node n=new Node(data);
            while (t!=null&&pos>0) {
                pos--;
                t1=t;
                t=t.next;
                
            }
            if(t==null){
                System.out.println("enter wrong position");
            }
            else if(t.next==null){
                t.next=n;
                n.next=null;
                
            }
            else{
                t1.next=n;
                n.next=t;
            }
        }
    }
    public static void main(String[] args) {
        pr1_linkedList obj=new pr1_linkedList();
        obj.create_list();
        Scanner sc=new Scanner(System.in);
        int input;
        do{

       
        System.out.println("\n1.insert_left\n2.insert_right\n3.delete_left\n4.delete_right\n5.print_list\n6.Search_list\n7.insertAt(data,position) :\n8.Delete(element): 0.Exit\n");
         input=sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("enter Data: ");
                int data=sc.nextInt();
                obj.insert_left(data);
                
                break;
            case 2:
            
            System.out.println("enter Data: ");
            int data1=sc.nextInt();
            obj.insert_right(data1);
                
            break;
            case 3:
            obj.delete_left();
            break;
            case 4:
            obj.delete_right();
            break;
            case 5:
            System.out.println("Linked list print: ");
            obj.print();
            break;

            case 6:
            System.out.println("Enter data to search in list ");
            int data2=sc.nextInt();
            obj.search(data2);
            break;
            case 7:
            System.out.println("Enter data  ");
            int data3=sc.nextInt();
            System.out.println("Enter Position to list to be created :  ");
            int data4=sc.nextInt();
            obj.insertAt(data3, data4);
            break;
            case 8:
            System.out.println("Enter element to Delete :");
            int data5=sc.nextInt();
            obj.delete(data5);
            break;
            case 0:
            System.out.println("Exited sucessfully :");
            break;



            default:
            System.out.println("you Entered  wrong input  :");
                break;
        }

    }while(input!=0);




    }

    
}
