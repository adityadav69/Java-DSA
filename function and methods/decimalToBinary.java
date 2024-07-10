import java.util.*;
public class decimalToBinary{
    public static int convert(int decimalnum){
        int binary=0;
        int pow=0;
        while(decimalnum>0){
            int remainder=decimalnum%2;
            binary=binary+remainder*(int)(Math.pow(10,pow));
            pow++;
            decimalnum=decimalnum/2;
        }
        return binary;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number please!");
        int decimalnum=sc.nextInt();
        System.out.println("Binary number of your decimal number is "+convert(decimalnum));
    }
}