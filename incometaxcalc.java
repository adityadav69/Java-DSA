import java.util.*;
public class incometaxcalc{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    long income;
    System.out.println("Enter the income");
    income=sc.nextInt();
    if(income>0 && income<500000){
        System.out.println("You have to pay 0% tax");
    }
    else if(income>=500000 && income<1000000){
        System.out.println("You have to pay 20% tax");
    }
    else if(income>=1000000){
        System.out.println("You have to pay 30% tax");
    }
    else{
        System.out.println("You are bhikhanga");
    }

    }
}