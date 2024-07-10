
public class passing_array_as_argument {

    public static void print(int arr[]) {
        System.out.println("Printing element of array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        arr[0] = 34;
    }

    public static void main(String args[]) {
        int array[] = {23, 43, 52, 53, 65};
        System.out.println("Before changing");
        print(array);//Array call function by refrence
        System.out.println("After changing");
        print(array);

    }
}
