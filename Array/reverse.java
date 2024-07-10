public class reverse {

    public static void reverse(int arr[]) {
        int temp;
        int First = 0;
        int Last = arr.length - 1;
        while (First < Last) {
            temp = arr[First];
            arr[First] = arr[Last];
            arr[Last] = temp;
            Last = Last - 1;
            First = First + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {

        int arr[] = {2, 4, 31, 33, 12, 21};
        reverse(arr);

    }
}
