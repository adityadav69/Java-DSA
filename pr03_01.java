import java.util.*;
public class pr03_01{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number you want to check either it is positive or negative");
        number=sc.nextInt();
        if(number>0){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is negative");
        }

    }
}