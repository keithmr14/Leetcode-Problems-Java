package medium;

import java.util.Arrays;
import static utils.ArrayUtils.*;

public class RemoveDup2 {

    public static int removeDuplicates(int[] nums) {

        if(nums.length == 0) return 0;

        // remove this to reduce runtime in leetCode, but add it outside leetCode
        if(!isNonDecreasingArray(nums))
            throw new IllegalArgumentException("array must be non-decreasing");

        int valid = 1;
        int lastNum = nums[0];
        boolean has2 = false;

        for(int i = 1; i < nums.length; i++) {

            int num = nums[i];

            if(num > lastNum) {

                nums[valid] = num;
                lastNum = num;
                valid++;
                has2 = false;
            }
            else if(num == lastNum && !has2) {

                nums[valid] = num;
                valid++;
                has2 = true;
            }
        }

        return valid;
    }

    public static void main(String[] args) {

        System.out.println("80. Remove Duplicates from Sorted Array II");

        // example 1
        int[] a1 = {1, 1, 1, 2, 2, 3};
        System.out.println("\nArray: " + Arrays.toString(a1));
        System.out.println("# of Unique Element and their 2nd Recurrence: " + removeDuplicates(a1));

        // example 2
        int[] a2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println("\nArray: " + Arrays.toString(a2));
        System.out.println("# of Unique Element and their 2nd Recurrence: " + removeDuplicates(a2));
    }
}
