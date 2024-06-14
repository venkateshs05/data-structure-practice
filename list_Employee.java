import java.util.Scanner;

class Node{
  String name;
  String gender;
  double salary;
  int empId;
  Node next;
  
  Node(String name,String gender, double salary,int empId){
    this.name=name;
    this.gender=gender;
    this.salary=salary;
    this.empId=empId;
    this.next=null;

  }
}


public class list_Employee {
    Scanner sc=new Scanner(System.in);
    Node root;
    void create_list(){
        root=null;
    }
    void insert_right(){
     Node t5=root;
        System.out.println("enter the ID :");
        int empId1=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name :");
        String name1=sc.nextLine();
        System.out.println("enter the GENDER :");
        String gender1=sc.nextLine();
        System.out.println("enter the SALARY :");
        double salary1=sc.nextInt();
        Node n=new Node(name1,gender1,salary1,empId1);
        if(root==null){
            root=n;
        }
        else{
            while(t5!=null){
                if(empId1==t5.empId){
                    System.out.println("you have already Employee with id : "+empId1);
                    return;
                }
                 t5=t5.next;
             }
            Node t;
            t=root;
            while(t.next!=null){
                t=t.next;

            }
            if(t.next==null){
                t.next=n;
                n.next=null;
            }
        }

    }

    void delete(int id){
        if(root==null){
            System.out.println("list is empty");
        }
        else {
            Node t2=root;
            Node t=root;
            while(t!=null&&t.empId!=id){
                t2=t;
                t=t.next;
            }
            if(t==null){
                System.out.println("you entered Wrong Emp id :");

            }
            else if(t==root){
                int temp=t.empId;
               t=root;
                root=root.next;
                t=null;
                System.out.println("Deleted the employee :"+ temp);

            }
            else if(t.next==null){
                t2.next=null;
                System.out.println("Deleted the employee :"+t.empId);

                
            }
            else{
                int temp=t.empId;
                t2.next=t.next;
                System.out.println("Deleted the employee :"+temp);


                    
            }
            
            
           

        }
    }
    void search(int id){
        Node t=root;
        if(root==null){
            System.out.println("list is empty");

        }
        else {
            while(t!=null&&t.empId!=id){
                t=t.next;
            }
            if(t==null){
                System.out.println("you entered Wrong Emp id :");

            }
            else if(t.empId==id){
                System.out.println("name is : "+t.name);
                System.out.println("gender is : "+t.gender);
                System.out.println("salary is : "+t.salary);
                System.out.println("empId is : "+t.empId);

            }
        }

    }
    void Update(){
        Node t=root;
        if(root==null){
            System.out.println("list is empty");

        }
        
        else {
            System.out.println("enter the Employee id to Update the employee INFO:-");
            int choice5=sc.nextInt();
            
            while(t!=null&&t.empId!=choice5){
                t=t.next;
            }
            if(t==null){
                System.out.println("you entered Wrong Emp id :");

            }
            else if(t.empId==choice5
            
            ){
                System.out.println("what to Update :");
                System.out.println("\n1.name:\n2.gender\n3.salary");
                int a=sc.nextInt();
                switch (a) {
                    case 1:
                    sc.nextLine();
                    System.out.println("Enter name  : ");
                    String a1=sc.nextLine();
                    t.name=a1;
                        
                        break;
                    case 2:
                    sc.nextLine();
                    System.out.println("Enter gender  : ");
                    String a2=sc.nextLine();
                    t.gender=a2;
                        
                        break;
                    case 3:
                    System.out.println("Enter salary  :");
                    double a3=sc.nextInt();
                    t.salary=a3;
                        
                        break;
                
                    default:
                        break;
                }
                

            }
        }

    }
    void printall(){
        Node t=root;
        if(root==null){
            System.out.println("list is empty");

        }
        else {
            do{

            
                System.out.println(" -----------Employee info---------  ");
                System.out.println("name is : "+t.name);
                System.out.println("gender is : "+t.gender);
                System.out.println("salary is : "+t.salary);
                System.out.println("empId is : "+t.empId);
                t=t.next;

            }
            while(t!=null);
        }

    }
    public static void main(String[] args) {
        list_Employee obj=new list_Employee();
        obj.create_list();
        Scanner sc=new Scanner(System.in);
        boolean c=true;
        do{
            System.out.println("\n1.insert Employee:\n2.delete Employee :\n3.search Employee 1:\n4.show all Emp list :\n5.Update Employee\n0.exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the information of Employee :-");
                    obj.insert_right();
                    
                    break;
                case 2:
                    System.out.println("enter the Employee id to delete employee:-");
                    int choice1=sc.nextInt();
                    obj.delete(choice1);
                    
                    break;
                case 3:
                    System.out.println("enter the Employee id to Search the employee:-");
                    int choice2=sc.nextInt();
                    obj.search(choice2);
                    
                    break;
                case 4:
                    obj.printall();
                    break;
                case 5:
                    
                     obj.Update();
                     break;
                case 0:
                System.out.println("Exited Sucessfully");
                c=false;
                    break;

                    
            
                default:
                    break;
            }
        }while(c);

        
    }
    
}
