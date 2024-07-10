import java.util.*;
public class input_output{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter the "+(i+1)+"th element of array");
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        System.out.println("The "+(i+1)+"th element of array is "+arr[i]);
    }
    
    }
}