import java.util.*;
public class prime{
    public static void checkPrime(int n){
        if(n<2){
            System.out.println("Number is less than 2 we can not say about prime or not prime");
            return;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Number is not Prime");
                return;
            }
        }
       System.out.println("Number is Prime");
       return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n to check prime");
        int n=sc.nextInt();
       checkPrime(n);
        
    }
}