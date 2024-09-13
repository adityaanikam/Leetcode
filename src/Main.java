Class Solution {
    public int[] productExceptSelf(int[] nums){
        int N = nums.length;
        // gives us the length of the array


        // Initialize two arrays: left_products and right_products
        // to store the cumulative products from the left and right sides.
        int[] left_products = new int[N];
        int[] right_products = new int[N];

        //output array will hold the final result.
        int[] output_arr = new int[N];

        // the leftmost product of left_products should always be 1
        left_products[0] = 1;

        //because no elements to the right of the last element that is n-1
        right_products[N-1] = 1;

        for(int i =1; i < N; i++) {
            left_products[i] = nums[i-1] * left_products[i-1];
        }

        for(int i = N-2; i >= 0; i--) {
            right_products[i] = nums[i+1] * right_products[i+1];

        }
        for(int i = 0; i < N;i++) {
            output_arr[i] = left_products[i] * right_products[i];
        }
        return output_arr;

    }
        }

public static void main(String[] args) {

}