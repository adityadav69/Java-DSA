import java.util.*;
public class AreaOFCircle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double radius;
        double area;
        double pi=3.14;
        System.out.println("Enter the radius");
        radius=sc.nextDouble();
        area=pi*radius*radius;
        System.out.println("Area of circle is");
        System.out.println(area);
    }
}