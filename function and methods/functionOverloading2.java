import java.util.*;
public class functionOverloading2{
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a,b;
        System.out.println(sum(5,40));

        
    }
}