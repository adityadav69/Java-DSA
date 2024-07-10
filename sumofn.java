import java.util.*;
public class sumofn{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum;
        sum=0;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int i=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is "+sum);

    }
}