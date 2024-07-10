import java.util.*;
public class pr02_01{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("Enter Third Number");
        int c=sc.nextInt();
        float d=(float)(a+b+c/3);
        System.out.println("Average is");
        System.out.println(d);
    }
}