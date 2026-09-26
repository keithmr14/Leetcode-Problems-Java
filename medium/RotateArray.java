package medium;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

        if(k < 0) throw new IllegalArgumentException(
                "right shift " + k + " mustn't be less than 0");

        int n = nums.length;

        if(n == 0) return;

        int[] original = Arrays.copyOf(nums, n);
        k %= n;

        for(int i = 0; i < n; i++) {

            nums[k] = original[i];
            k++;
            if(k == n) k = 0;
        }

        // remove this to reduce runtime in leetCode, but add it outside leetCode
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {

        System.out.println("189. Rotate Array");

        // example 1
        int[] a1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        System.out.println("\nArray: " + Arrays.toString(a1));
        rotate(a1, k1);

        // example 2
        int[] a2 = {-1, -100, 3, 99};
        int k2 = 2;
        System.out.println("\nArray: " + Arrays.toString(a2));
        rotate(a2, k2);
    }
}
