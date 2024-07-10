import java.util.*;
public class ifelse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("You are not adult");
        }
        if(age>13 && age<18){
            System.out.println("You are teenager");
        }
    }
}