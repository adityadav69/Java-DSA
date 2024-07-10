
public class linear_search{
    public static int linearSearch(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
public static void main(String args[]){
    int arr[]={23,3,45,53,18,63,88};
    int key=53;
    if(linearSearch(arr,key)==-1){
        System.out.println("Key not found in array");
    }
    else{
        System.out.println(linearSearch(arr,key));
    }
    
    }
}