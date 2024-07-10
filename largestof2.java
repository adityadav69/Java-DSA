import java.util.*;
public class largestof2{
    public static void main(String args[]){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        num1=sc.nextInt();
        System.out.println("Enter the Second number");
        num2=sc.nextInt();
        if(num1>num2){
            System.out.println("First number is greater");
        }
        else{
            System.out.println("Second number is greater");
        }
    }
}