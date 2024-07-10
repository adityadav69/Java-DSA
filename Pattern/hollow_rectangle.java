public class hollow_rectangle {
    public static void hollow_rectangle(int Trows, int Tcoloumns) {
        for (int i = 0; i < Trows; i++) {
            for (int j = 0; j < Tcoloumns; j++) {
                if (i == 0 || i == Trows - 1 || j == 0 || j == Tcoloumns - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(2, 45);
    }
}
