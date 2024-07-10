public class max_subarray {
    public static void maxSum(int arr[]) {
        int maxsum=Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++) {
                   sum=sum+arr[k];
                }
                System.out.println(sum);

                if(sum>maxsum){
                    maxsum=sum;
                }
            }
        }
        System.out.println("maximum sum is "+maxsum);
    }

    public static void main(String args[]) {
        int arr[] = {1, -2, 6, -1, 3};
        maxSum(arr);
    }
}
