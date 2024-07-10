public class inverted_and_rotated_half_pyramid {
    public static void  inverted_and_rotated_half_pyramid(int Trows) {
        for (int i = 0; i < Trows; i++) {
            for (int j = 0; j <Trows-i; j++) {
               System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        inverted_and_rotated_half_pyramid(4);
    }
}
