public class character{
    public static void main(String args[]){
        char ch=65;
        for(int line=1;line<=5;line++){
            for(int j=1;j<=line;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}