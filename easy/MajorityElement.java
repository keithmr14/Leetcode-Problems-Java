package easy;

import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        if(nums.length == 0) throw new IllegalArgumentException("array mustn't be empty");

        int count = 0;
        int half = nums.length / 2;
        Arrays.sort(nums);
        int majElem = nums[0];

        for (int num : nums) {

            if (num != majElem) {

                majElem = num;
                count = 0;
            }

            count++;

            if (count > half) return majElem;
        }

        throw new IllegalArgumentException("there are no majority element in the array");
    }

    public static void main(String[] args) {

        System.out.println("169. Majority Element");

        // example 1
        int[] a1 = {3, 2, 3};
        System.out.println("\nArray: " + Arrays.toString(a1));
        System.out.println("Majority Element: " + majorityElement(a1));

        // example 2
        int[] a2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("\nArray: " + Arrays.toString(a2));
        System.out.println("Majority Element: " + majorityElement(a2));
    }
}
