import java.util.*; 
import java.io.*;

class Exam2{
  static String a;
  static String b;
   static int arr[]=new int[3];
   static  int arr1[]=new int[3];


  public static String ArrayChallenge(String[] strArr) {
    a=strArr[0];
    b=strArr[1];
   
     char ka[]=a.toCharArray();
     char ja[]=b.toCharArray();
     
     
     char ar[]=new char [20];
     for(int i=0;i<3;i++){
       if(ka[i]=='0'&&ja[i]=='0'){

        
         ar[i]='0';
       }
       else{
        
        
         ar[i]='1';

       }
       

     }
     String str1="";
     for(int i=0;i<3;i++){
       
       str1=str1+ar[i];
  
       
     }
     //System.out.println(str1);
     strArr[0]=str1;
     
    // code goes here  
    return strArr[0];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    String a=s.nextLine();
    String arrr[]=a.split(" ");
    System.out.print(ArrayChallenge(arrr)); 
  }



}