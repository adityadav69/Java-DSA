import java.util.*;
public class twodimensional{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
int mat[][]=new int[3][2];
System.out.println(mat.length);    
System.out.println(mat[0].length); 
for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[0].length;j++){
        System.out.println("Enter the "+i+""+j+" Element of Matrix");
        mat[i][j]=sc.nextInt();
    }
}  
for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[0].length;j++){
        System.out.print(mat[i][j]);
}  
System.err.println("");
}
}

}