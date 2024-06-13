import java.util.Scanner;

public class pr5_stack_infix_to_postfix {
int maxSize,tos;
char temp;
char stack[];
    void create_stack(int size){
        maxSize=size;
        tos=-1;
         stack=new char[maxSize];
    }
    void push(char e){
        tos++;
        stack[tos]=e;
    }
    char pop(){
        temp=stack[tos];
        tos--;
        return temp;
    }
    char peek(){
        temp=stack[tos];
        return temp;
    }
    void print(){
        for(int i=tos;i>-1;i--){
        System.out.println(stack[i]);
        }
    }
    boolean isEmpty(){
        if(tos==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull(){
        if(tos==maxSize-1){
            return true;
        }
        else{
            return false;
        }
    }
    int precendance(char c){
        switch (c) {
            case '^':return 3;
            case '*':return 2;
            case '/':return 2;
            case'%':return 2;
            case '+':return 1;
            case'-':return 1;
            case '(':return 0;
            case')':
            return 0;
            default: return -1;
                
        }
    }

    public static void main(String[] args) {
        pr5_stack_infix_to_postfix obj=new pr5_stack_infix_to_postfix();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the expression :");
        String exp=sc.nextLine();
        int length=exp.length();
        obj.create_stack(length);
        int j=0;
        char postfix[]=new char[length];
        for(int i=0;i<length;i++){
            char a=exp.charAt(i);
            if(!(a=='('||a==')'||a=='+'||a=='-'||a=='^'||a=='*'||a=='/'||a=='%')){
                postfix[j]=a;
                j++;
                if(i==length-1){
                    while(obj.isEmpty()!=true && obj.peek()!='('){
                        //System.out.print(a);
                    postfix[j]=obj.pop();
                    j++;
                    
                    }

                }
             

            }
           
            else if(obj.isEmpty()==true||a=='('){
                obj.push(a);
            }
            else if(a==')'){
                while((obj.isEmpty()!=true && obj.peek()!='(')){
                    //System.out.print(a);
                postfix[j]=obj.pop();
                j++;
                
                }
                obj.pop();
                //j++;
    
               }
          
            
                
            
            else if(obj.precendance(obj.peek())<obj.precendance(a)){
                obj.push(a);

                }
                else{
                    while((obj.isEmpty()!=true && obj.peek()!='(')){
                        //System.out.print(a);
                    postfix[j]=obj.pop();
                    j++;
                    
                    }
                    obj.push(a);
                    System.out.println(obj.peek());

                }

        }
        while(!obj.isEmpty()){
            postfix[j]=obj.pop();
            j++;
        }
        for(int i=0;i<+j;i++){
           System.out.print( postfix[i]);
        }
       

        
    }
    
}
