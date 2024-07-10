import java.util.*;
public class parameter{
    public static int calcSum(int a,int b){
       return a+b;
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=calcSum(x,y);
        System.out.println(z);

    }
}