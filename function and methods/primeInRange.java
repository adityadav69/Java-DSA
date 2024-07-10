import java.util.*;
public class primeInRange{
    public static boolean checkPrime(int n){
        boolean isprime=true;
        if(n<2){
            isprime=false;
            return isprime;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime= false;
                return isprime;
            }
        }
       if(isprime=true){
        System.out.print("Number is prime ");
       }
       else{
        System.out.print("Number is not prime ");
       }
       return isprime;
    }
    public static void primeInRange(int n){
        for(int i=2;i<n;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range to print prime");
        int n=sc.nextInt();
       primeInRange(n);
        
    }
}