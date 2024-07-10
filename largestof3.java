import java.util.*;
public class largestof3{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int number1,number2,number3;
    System.out.println("Enter first number");
    number1=sc.nextInt();
    System.out.println("Enter Second number");
    number2=sc.nextInt();
    System.out.println("Enter Third number");
    number3=sc.nextInt();
    if(number1==number2 && number2==number3){
        System.out.println("All number are equal");
    }
    else{
    if(number1>number2){
        if(number1>number3){
            System.out.println("Number1 is greater");
        }
        else{
            System.out.println("Number3 is greater");
        }
    }
    else{
        if(number2>number3){
            System.out.println("Number 2 is Greater");
        }
        else{
            System.out.println("Number 3 is greater");
        }
    }
    }


    }
}