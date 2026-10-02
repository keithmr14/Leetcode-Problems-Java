package medium;

import java.util.Arrays;

public class JumpGame {

    public static boolean canJump(int[] nums) {

        int maxIndex = 0;

        for(int i = 0; i < nums.length - 1 && i <= maxIndex; i++) {

            int num = nums[i];

            if(num < 0) throw new IllegalArgumentException(
                    "integer " + num + " mustn't be less than 0");

            maxIndex = Math.max(maxIndex, i + num);
        }

        return (maxIndex >= nums.length - 1);
    }

    public static void main(String[] args) {

        System.out.println("55. Jump Game");

        // example 1
        int[] a1 = {2, 3, 1, 1, 4};
        System.out.println("\nArray: " + Arrays.toString(a1));
        System.out.println("Can Reach Last Index? " + canJump(a1));

        // example 2
        int[] a2 = {0, 2, 3};
        System.out.println("\nArray: " + Arrays.toString(a2));
        System.out.println("Can Reach Last Index? " + canJump(a2));
    }
}
