import java.util.*;
public class calc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char operator;
        int a,b;
        double result;
        System.out.println("Enter the number 1");
        a=sc.nextInt();
        System.out.println("Enter the number 2");
        b=sc.nextInt();
        System.out.println("Please Enter the operand you want '+' for addition '-' for Subtraction '*' for Multiplication '/' for division");
        operator=sc.next().charAt(0);
        
        switch(operator){
            case '+':
                result=a+b;
                System.out.println(result);
                break;
            case '-':
                result=a-b;
                System.out.println(result);
                break;
            case '*':
                result=a*b;
                System.out.println(result);
                break;
            case '/':
                result=a/b;
                System.out.println(result);
                break;
            default:
                System.out.println("Your Input operand is not supported in our calculator");
        }
    }
}