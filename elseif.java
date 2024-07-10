import java.util.*;
public class elseif{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int age;
    System.out.println("Enter the age");
    age=sc.nextInt();
    if(age>=18){
        System.out.println("You are adult");
    }
    else if(age>=5 && age<18){
        System.out.println("You are teenager");
    }
    else if(age>0 && age<=5){
        System.out.println("You are Child");
    }
    else{
        System.out.println("You are not born yet !");
    }

    }
}