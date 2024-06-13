import java.util.Scanner;

public class pr_4stack_wellness_of_control
{
    int maxSize,tos;
    char stack[];
    void create_stack(int size){
        maxSize=size;
        tos=-1;
        stack=new char[maxSize];
    }
    void push(char e){
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
    char pop(){
        char temp=stack[tos];//1st
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
    char peek(){
        return (stack[tos]);
    }
    //print_stack():prints data in LIFO manner,tos 0
    void print_stack(){
        for(int i=tos;i>-1;i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        String line;
        boolean flag= true;
        char temp;

       pr_4stack_wellness_of_control obj=new pr_4stack_wellness_of_control();
        System.out.println("Enter the name");
        Scanner sc=new Scanner(System.in);
        line=sc.nextLine();
      obj.create_stack(line.length());
      for(int i=0;i<line.length();i++)
      {
        char c=line.charAt(i);
        if(c=='{'){
            obj.push(c);
        }
        else if(c=='}' && obj.isEmpty()!=true){
            temp=obj.pop();

        }

        else if(c=='}'&&  obj.isEmpty()==true){
            System.out.println("'}' is unexpected ");
            flag=false;
            break;

        } 
    }
        if(obj.isEmpty()== true && flag==true){
            System.out.println("String is Balanced  ");
        }
        else if(!obj.isEmpty()){
            System.out.println("'}' is expected ");
            

        }
     
    }
        
}
    

