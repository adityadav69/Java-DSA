public class inverted_with_numbers{
    public static void inverted_with_numbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }
    public static void main(String args[]){
        inverted_with_numbers(5);
    }
}