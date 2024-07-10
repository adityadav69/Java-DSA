
public class binary_search{
    public static int BinarySearch(int arr[],int key){
       int start=0;
       int end=arr.length-1;
       int mid;
       while(start<=end){
        mid=(start+end)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){//left
         end=mid-1;
        }
        else{//Right
            start=mid+1;
        }        
       }
       return -1;
    }
public static void main(String args[]){
    int arr[]={21,23,45,67,89,122};
    int key=23;
    if(BinarySearch(arr,key)==-1){
        System.out.println("Key not found");
    }
    else{
        System.out.println(BinarySearch(arr,key));
    }
    
    }
}