class Allsort{

    // void merge_sort(int arr[],int start,int end){
    //     if(start<end){
    //     int mid =(start+end)/2;
    //     merge_sort(arr, start, mid);
    //     merge_sort(arr, mid+1, end);
    //     merger(arr, start, mid, end);
    //     }


    // }
    // void merger(int arr[],int start,int mid,int end){
    //     int i=start;
    //     int j=mid+1;
    //     int temp[]=new int[arr.length];
    //     int ti=start;
        
        
    //     while (i<=mid && j<=end) {
    //         if(arr[i]<arr[j]){
    //             temp[ti]=arr[i];
    //             ti++;
    //             i++;
    //         }
    //         else{
    //             temp[ti]=arr[j];
    //             ti++;
    //             j++;

    //         }
   
    //     }
    
    //     while (i<=mid) {
    //         temp[ti]=arr[i];
    //             ti++;
    //             i++;
            
    //     }
    //     while (j<=end) {
    //         temp[ti]=arr[j];
    //             ti++;
    //             j++;
            
    //     }
    //     for(int k=start;k<=end;k++){
    //         arr[k]=temp[k];
    //     }
    // }

    // void print(int arr[]){
    //     for(int k=0;k<arr.length;k++){
    //       System.out.print(arr[k]+" ");
    //     }

    // }
    void Quicksort(int arr[],int start,int end){
       
        int i=start;
        int j=end;
        int pivot=end;

        while(i<j){
           while(arr[i]<arr[pivot])
           i++;
           if(i<j){
            int k=arr[i];arr[i]=arr[j];arr[j]=k;
           }
        }
        if(j>start){
            Quicksort(arr, start, j-1);
        }
    }

        
    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void selection_sort(int arr[]){
        int min,pos;
        for(int i=0;i<arr.length-1;i++){
            min=arr[i];
            pos=i;
        for(int j=i;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
                pos=j;
            }
        }
        arr[pos]=arr[i];arr[i]=min;
        }
    }
    void insertion_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           int new_element=arr[i+1];
           int j=i+1;
           while (j>0&& arr[j-1]>new_element) {
            arr[j]=arr[j-1];
            j--;
            
           } 
           arr[j]=new_element;
        }
    }
    void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
               if( arr[i]>arr[j]){
                int k=arr[i];
                arr[i]=arr[j];
                arr[j]=k;
               }
            }
        }
    }


    
    public static void main(String[] args) {

        int arr[]={5,8,3,4,34,2,6,1,9};
        Allsort obj=new Allsort();
        //obj.merge_sort(arr, 0,arr.length-1);
        //obj.Quicksort(arr, 0,arr.length-1);
        //obj.selection_sort(arr);
        //obj.insertion_sort(arr);
        obj.bubble_sort(arr);
        obj.print(arr);
        

        
    }
}