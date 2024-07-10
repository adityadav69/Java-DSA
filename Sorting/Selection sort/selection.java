import java.util.*;
public class selection{
    public static void SelectionSort(int arr[]){
       for(int i=0;i<arr.length-1;i++){
        int minPos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        int temp;
        temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;

       }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
public static void main(String args[]){

int arr[]={12,4,8,9,10};
SelectionSort(arr);
printArray(arr);

}
}