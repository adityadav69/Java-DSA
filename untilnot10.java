import java.util.*;
public class untilnot10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter number");
            n=sc.nextInt();
            if(n%10==0){
                System.out.println("You entered multiple of 10 now you can go");
                break;
            }
            System.out.println(n);
        }while(true);

    }
}