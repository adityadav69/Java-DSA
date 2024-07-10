import java.util.*;
public class binomial{
    public static int calcFactorial(int number){
        int fact=1;
        if(number==1 || number==0){
            return 1;
        }
        else{
             for(int i=1;i<=number;i++){
                fact=fact*i;
             }
             return fact;
        }
       
    }
    public static int calcBinomial(int n,int r){
         int nfact=calcFactorial(n);
        int rfact=calcFactorial(r);
        int z=n-r;
        int nrFact=calcFactorial(z);
        int ncr=nfact/(rfact*nrFact);
        return ncr;

    }

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of r");
        int r=sc.nextInt();
        System.out.println("Binomial coefficient is "+ calcBinomial(n,r));

        

    }
}