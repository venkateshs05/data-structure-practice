

import java.util.Scanner;

public class pr1_stack{
    int maxSize,tos,stack[];
    void create_stack(int size){
        maxSize=size;
        tos=-1;
        stack=new int[maxSize];
    }
    void push(int e){
        tos++;
        stack[tos]=e;//pushed------stack[++tos]=e;
    }
    //isFull():return true if full else false
    boolean isFull(){
        if(tos==maxSize-1){
            return true;

        }
        else{
            return false;
        }

    }
    //pop(): e remove the top element and return element from tos,tos-1
    int pop(){
        int temp=stack[tos];//1st
        tos--;//2nd
        return temp;//3rd
    }
    boolean isEmpty(){
        if(tos==-1)//as array
        {
            return true;

        }
        else{
            return false;
        }

    }
    //peek(): e only return element from tos /on the top
    int peek(){
        return (stack[tos]);
    }
    //print_stack():prints data in LIFO manner,tos 0
    void print_stack(){
        for(int i=tos;i>-1;i--){
            System.out.println(stack[i]);
        }
    }
    //main code for menu driven 1.push 2.pop 3.peek 4.print
    public static void main(String args[]){
        int size,element,choice;
        pr1_stack obj=new pr1_stack();
        System.out.println("Enter the size of stack");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        obj.create_stack(size);
        do{
            System.out.println("\n1.push\n2.pop\n3.peek\n4.print\n0.exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                if(obj.isFull()!=true){
                    element=sc.nextInt();
                    obj.push(element);
                    break;

                }
                else{
                    System.out.println("stack is full");
                    break;
                }
                case 2:
                if(obj.isEmpty()!=true){
                    
                    obj.pop();
                    break;

                }
                else{
                    System.out.println("stack is empty");
                    break;
                }
                case 3:
                if(obj.isEmpty()!=true){
                    
                    obj.peek();
                    break;

                }
                else{
                    System.out.println("stack is empty");
                    break;
                }
                case 4:
                if(obj.isEmpty()!=true){
                    
                    obj.print_stack();
                    break;

                }
                else{
                    System.out.println("stack is empty");
                    break;
                }
                    
                    
            
                default:
                    break;
            }

        }while(choice!=0);//condition 

    }
}