import java.util.*;
public class factorial{
    public static int calcFactorial(int number){
        int fact=1;
        if(number==1 || number==0){
            return 1;
        }
        else{
             for(int i=1;i<=number;i++){
                fact=fact*i;
             }
             return fact;
        }
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to calculate factorial");
        int n=sc.nextInt();
        int fact=calcFactorial(n);
        System.out.println("Factorial of given number is "+ fact);
    }
}