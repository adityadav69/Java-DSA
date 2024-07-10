import java.util.*;
public class untilnot10c{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter number");
            n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("Your number is "+n);
        }while(true);

    }
}