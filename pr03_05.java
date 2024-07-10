import java.util.*;
public class pr03_05{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     int year;
        System.out.println("Enter the year");
        year=sc.nextDouble();
        if(year%4==0){
            System.out.println("Not ");
        }
        else{
            System.out.println("You have'nt fever");
        }

    }
}