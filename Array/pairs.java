
public class pairs {

    public static void printPairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }

            System.out.print("\n");

        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 23, 13, 9};
        printPairs(arr);

    }
}
