

public class Circular_linked_list
{
    Node root,last;
    void create_List()
    {
        root=last=null;
    }
    void insert_left(int data)
    {
        Node n=new Node(data);
        if(root==null) {
            root=last=n;
            last.next=root;
        }
        else {
            n.next=root;//1
            root=n;//2
            last.next=root;//3
        }

    }
    void delete_left()
    {
        if(root==null)
            System.out.println("List empty");
        else
        {
            Node t=root;//1
            root=root.next;//2
            last.next=root;//3
            System.out.println("Deleted:"+t.data);//4 only to show response
        }
    }
    void insert_right(int data)
    {
        Node n=new Node(data);
        if(root==null)
        {
            root=last=n;
            last.next=root;
        }
        else
        {
          last.next=n;//1
          last=n;//2
          last.next=root;//3
        }
    }
    void delete_right() {
        if (root == null)
            System.out.println("List empty");
        else
        {
            Node t, t2;
            t = t2 = root;//1
            while (t.next != root)//2 t!=last
            {
                t2 = t;//left behind
                t = t.next;//moves ahead
            }
            if (t == root)//only for single node
                root = last = null;//manual deletion of root
            else {
                last = t2;
                last.next = root;
                System.out.println("Deleted:" + t.data);//3 only to show response
            }
        }
    }
    void print_list() {
        if (root == null)//root is assigned not created
            System.out.println("Empty List");
        else {
            Node t = root;//1
           do
            {
                System.out.print("|" + t.data + "|->");
                t = t.next;//
            } while (t != root);//2
        }
    }
}







