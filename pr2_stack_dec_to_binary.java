

import java.util.Scanner;

public class pr2_stack_dec_to_binary {
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
   public static void main(String args[]){
    int size=64;//64 bits of proceesing
    pr2_stack_dec_to_binary obj=new pr2_stack_dec_to_binary();
    //read a number in dec
    //using loop break number /2 and push  reminder to stack
    
     System.out.println("Enter the size of stack");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rem,k;
        do{
            rem=number%2;
            obj.push(rem);
           k=number/2;

        }while(k!=0);
       System.out.println("in binary obj :");
       obj.print_stack();

   }
    
}

