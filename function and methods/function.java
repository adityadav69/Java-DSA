public class function{
    public static void PrintHello(String s){
        int result=0;
       for(int i=0;i<s.length();i++){
        System.out.println("char at i is "+(int)s.charAt(i));
        System.out.println("char at i+1 is "+(int)s.charAt(i+1));
         result=result+((int)s.charAt(i)-(int)s.charAt(i+1));
         
         System.out.println("reslut is "+result);

       }
    }
    public static void main(String args[]){
        String s="aello";
        PrintHello(s);

    }
}