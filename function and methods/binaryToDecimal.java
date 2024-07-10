import java.util.*;
public class binaryToDecimal{
    public static int convert(int binarynum){
        int decimal=0;
        int pow=0;
        while(binarynum>0){
            int lastDigit=binarynum%10;
            decimal=decimal+lastDigit*(int)(Math.pow(2,pow));
            pow++;
            binarynum=binarynum/10;
        }
        return decimal;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number please!");
        int binarynum=sc.nextInt();
        System.out.println("Decimal number of your binary number is "+convert(binarynum));
    }
}