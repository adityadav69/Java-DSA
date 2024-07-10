import java.util.*;
public class pr03_02{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     double temperature;
        System.out.println("Enter the Temperature");
        temperature=sc.nextDouble();
        if(temperature>=100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You have'nt fever");
        }

    }
}