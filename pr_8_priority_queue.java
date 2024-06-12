import java.util.Scanner;

public class pr_8_priority_queue {
    int maxSize,front,rear,temp;
int Queue[];
    void create_queue(int size){
        maxSize=size;
        Queue=new int [maxSize];
        front=0;
        rear=-1;

    }
    void EnQueue(int k){
        rear++;
        Queue[rear]=k;
        for(int i=front;i<rear;i++){
            for(int j=front;j<rear;j++){
                if(Queue[j]>Queue[j+1]){
                    int temp=Queue[j];
                    Queue[j]=Queue[j+1];
                    Queue[j+1]=temp;





                }
            }
        }
        
    }
    boolean isFull(){
        if(rear==maxSize-1){
            return true;

        }
        else{
            return false;
        }
    }
    int DeQueue(){
        temp=Queue[front];
        front++;
        return temp;
    }
    boolean isEmpty(){
        if(front>rear){
            return true;
        }
        else{return false;}
    }
    void printQueue(){
        for(int i=front;i<=rear;i++){
            System.out.print(Queue[i]+"--");
        }
    }
    public static void main(String[] args) {
         int size,element,choice;
        pr_8_priority_queue obj=new pr_8_priority_queue();
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
