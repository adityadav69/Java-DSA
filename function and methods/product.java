import java.util.*;
public class product{
    public static int CalcProduct(int x, int y){
        int product=x*y;
        return product;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
         System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println(CalcProduct(a,b));
    }
}