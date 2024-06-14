import java.util.Scanner;




public class Imp_01_implementation_of_two_stacks_inOne_array {
    int maxSize,tos1,tos2;
int temp;
int stack[];
    void create_stack(int size){
        maxSize=size;
        tos2=maxSize;
        tos1=-1;
         stack=new int[maxSize];
    }
    // void create_stack1(int size){
    //     maxSize=size;
        
         
    // }
    
    void push1(int e){
        tos1++;
        stack[tos1]=e;
    }
    void push2(int e){
        tos2--;
        stack[tos2]=e;
    }
    int pop1(){
        temp=stack[tos1];
        tos1--;
        return temp;
    }
    int pop2(){
        temp=stack[tos2];
        tos2++;
        return temp;
    }
    int peek1(){
        temp=stack[tos1];
        return temp;
    }
    int peek2(){
        temp=stack[tos2];
        return temp;
    }
    void print1(){
        for(int i=tos1;i>-1;i--){
        System.out.println(stack[i]);
        }
    }
    void print2(){
        for(int i=tos2;i<maxSize;i++){
        System.out.println(stack[i]);
        }
    }
    boolean isEmpty1(){
        if(tos1==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isEmpty2(){
        if(tos2==maxSize){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull1(){
        if(tos1==maxSize-1 || tos1+1==tos2){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull2(){
        if(tos2==0 || tos2-1==tos1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
         int size,element,choice;
        Imp_01_implementation_of_two_stacks_inOne_array obj=new Imp_01_implementation_of_two_stacks_inOne_array();
        System.out.println("Enter the size of stack");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        obj.create_stack(size);
       
        
        do{
            System.out.println("\n1.push_for_stack1 \n2.pop_for_stack1 \n3.peek_for_stack1 \n4.print_for_stack1 ");
            System.out.println("5.push_for_stack 2 \n6.pop_for_stack 2 \n7.peek_for_stack 2 \n8.print_for_stack 2 \n0.exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                if(obj.isFull1()!=true){
                    element=sc.nextInt();
                    obj.push1(element);
                    break;

                }
                else{
                    System.out.println("stack is full");
                    break;
                }
                case 2:
                if(obj.isEmpty1()!=true){
                    System.out.println("Element Popped:"+obj.pop1());
                    
                    break;

                }
                else{
                    System.out.println("stack is empty");
                    break;
                }
                case 3:
                if(obj.isEmpty1()!=true){
                    System.out.println(" peek element is :");
                    System.out.println( obj.peek1());
                    break;

                }
                else{
                    System.out.println("stack is empty");
                    break;
                }
                case 4:
                if(obj.isEmpty1()!=true){
                    System.out.println(" stack 1 element are  :");
                    obj.print1();
                    break;

                }
                else{
                    System.out.println("stack is empty");
                    break;
                }
                case 5:
                if(obj.isFull2()!=true){
                    element=sc.nextInt();
                    obj.push2(element);
                    break;

                }
                else{
                    System.out.println("stack is full");
                    break;
                }
                case 6:
                if(obj.isEmpty2()!=true){
                    
                    System.out.println("Element Popped:\t"+ obj.pop2());
                    break;

                }
                else{
                    System.out.println("stack is empty");
                    break;
                }
                case 7:
                if(obj.isEmpty2()!=true){
                    System.out.println(" peek element is :");
                    System.out.println( obj.peek2());
                    break;

                }
                else{
                    System.out.println("stack is empty");
                    break;
                }
                case 8:
                if(obj.isEmpty2()!=true){
                    System.out.println(" stack 2 element are  :");
                    obj.print2();
                    break;

                }
                else{
                    System.out.println("stack is empty");
                    break;
                }
                case 0:
                System.out.println("code exited sucessfully :");
                break;

                    
                    
            
                default:
                System.out.println("cinvalid key is entered :");
                    break;
            }

        }while(choice!=0);//condition 
        
    }
    
}
