import java.util.*;
public class switchc{
    public static void main(String args[]){
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 's' for samosa and 'm' for mango shake and 'b' for burger");
        ch=sc.next().charAt(0);
        switch(ch){
            case 's':
                System.out.println("Take your Samosa");
                break;
            case 'b':
                System.out.println("Take your Burger");
                break;
            case 'm':
                System.out.println("Take your Mango Shake");
                break;
            default:
                System.out.println("Tu kya soch raha hai koi bhi key daba duga aur mai lake de duga sapne me se uth ja");
            
        }
        
    }
}