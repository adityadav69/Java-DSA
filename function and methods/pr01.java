import java.util.*;
public class pr01{

     public static float average(float a,float b,float c){
        return (float)(a+b+c)/3;
     }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Average is "+ average(a,b,c));
    }
}