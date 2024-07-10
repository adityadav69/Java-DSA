
public class largest_number{
    public static int getLargest(int arr[]){
         int largest=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
       }
       return largest;
    } 
public static void main(String args[]){
    int array[]={23,45,633,18,90,24};
    System.out.println("Largest number in the array is "+getLargest(array));
    }
}