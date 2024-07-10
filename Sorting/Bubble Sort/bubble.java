import java.util.*;
public class bubble{
    public static void BubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-turn-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++; 
                } 
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
public static void main(String args[]){

int arr[]={12,4,8,9,10};
BubbleSort(arr);
printArray(arr);

}
}