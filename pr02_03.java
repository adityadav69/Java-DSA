import java.util.*;
public class pr02_03{
    public static void main(String args[]){
        float price1,price2,price3,total,bill;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        price1=sc.nextFloat();
        System.out.println("Enter the price of pen");
        price2=sc.nextFloat();
        System.out.println("Enter the price of eraser");
        price3=sc.nextFloat();
        total=(price1+price2+price3);
        System.out.print("Total= ");
        System.out.println(total);
        total=total+(total*18/100);
        System.out.print("Bill after GST of 18% = ");
        System.out.println(total);

        


    }
}