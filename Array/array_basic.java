public class array_basic{
public static void main(String args[]){
    int arr[]=new int[50];//First method to declare an Array
    // int arr2[]=new int[]; //This will throw error
    int Number[]={1,2,3};
    arr[0]=10;
    System.out.println(arr[0]);
    for(int i=0;i<Number.length;i++){
        System.out.println(Number[i]);
    }

    }
}