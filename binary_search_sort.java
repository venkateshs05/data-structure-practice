public class binary_search_sort {
    int binary_search(int a[],int start,int end,int key)

{

if(start<=end)

{

int mid=(start+end)/2;

if(a[mid]==key)

               return(mid);//position

       else

               {

                   if(key<a[mid])

                           return binary_search(a,start,mid-1,key);

                   else

                           return binary_search(a,mid+1,end,key);

               }

}

else

       return(-1);

}
public static void main(String[] args) {
    binary_search_sort obj=new binary_search_sort();
    int a[]={10,20,30,40,50};
    int start=0;
    int key=200;
    int end=a.length-1;
  int result=obj.binary_search(a,start,end,key);
  if(result==-1){
    System.out.println(key+" is not found");

  }
  else{
    
    System.out.println(key+" is found");
  }

}
    
}
