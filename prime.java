import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number to check whether number is prime or not");
        n=sc.nextInt();
        if(n==2){
            System.out.println("Number is prime");
        }
        else{
        for(int i=2;i<Math.sqrt(n);i++){  //we can also check condition less than n wala lekin time complexity badh jaega
            if(n%i==0){
                System.out.println("Number is not Prime");
                return;
            }
        }
    System.out.println("Number is Prime");
        }
        
    }
}