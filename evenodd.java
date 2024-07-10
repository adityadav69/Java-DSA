import java.util.*;
public class evenodd{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("Enter the number you want to check either number is even or odd");
        number=sc.nextInt();
        if(number%2!=0){
            System.out.println("Entered number is odd number");
        }
        else{
            System.out.println("Enterd number is Even number");
        }
    }
}