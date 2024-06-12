import java.util.Scanner;

public class pr_7_Circular_queue {
    int maxSize,front,rear,temp,count;
int Queue[];
    void create_queue(int size){
        maxSize=size;
        Queue=new int [maxSize];
        front=0;
        rear=-1;
        count=0;

    }
    void EnQueue(int k){
        count++;
        rear=(rear+1)%maxSize;
        Queue[rear]=k;
        
    }
    boolean isFull(){
        if(count==maxSize){
            return true;

        }
        else{
            return false;
        }
    }
    int DeQueue(){
        temp=Queue[front];
        front=(front+1)%maxSize;
        count--;
        return temp;
    }
    boolean isEmpty(){
        if(count==0){
            return true;
        }
        else{return false;}
    }
    void printQueue(){
        int i=front,c=0;
        while(c<count){
            System.out.print(Queue[i]+"--");
            i=(i+1)%maxSize;
            c++;
        }
    }
    public static void main(String[] args) {
         int size,element,choice;
        pr_7_Circular_queue obj=new pr_7_Circular_queue();
        System.out.println("Enter the size of Queue");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        obj.create_queue(size);
        do{
            System.out.println("\n1.enqueue\n2.deQueue\n3.print\n0.exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                if(obj.isFull()!=true){
                    element=sc.nextInt();
                    obj.EnQueue(element);
                    break;

                }
                else{
                    System.out.println("Queue is full");
                    break;
                }
                case 2:
                if(obj.isEmpty()!=true){
                    
                    System.out.println( obj.DeQueue());
                    break;

                }
                else{
                    System.out.println("Queue is empty");
                    break;
                }
               
                
                case 3:
                if(obj.isEmpty()!=true){
                    
                    obj.printQueue();
                    break;

                }
                else{
                    System.out.println("Queue is empty");
                    break;
                }
                    
                    
            
                default:
                    break;
            }

        }while(choice!=0);//condition 
        
    }
    
}
