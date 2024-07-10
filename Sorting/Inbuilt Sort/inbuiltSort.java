import java.util.*;
public class inbuiltSort{
    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
public static void main(String args[]){

// int arr[]={12,4,8,9,10};

// Arrays.sort(arr);//It sort whole array in ascending order
// Arrays.sort(arr,0,3);//It sort from index 0 to 3
// printArray(arr);
//If we want to sort in Desending order firstly we have to declare array as Objet as Integer arr[]={};
Integer arr[]={12,4,8,9,10};
// Arrays.sort(arr, Collections.reverseOrder());
// printArray(arr);
//We can also sort in bound like

Arrays.sort(arr,0,3,Collections.reverseOrder());
printArray(arr);

}
}