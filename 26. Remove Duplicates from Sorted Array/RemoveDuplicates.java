import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int lastNum = nums[0];
        int k = 1; // also acts as to where next num will be put at

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > lastNum) { // ignore same as lastNum
                lastNum = nums[i];
                nums[k] = nums[i]; // put to where k is
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        // example 1
        int[] array = {1, 2, 2, 3, 3, 4, 5, 6, 7, 8};
        RemoveDuplicates rev = new RemoveDuplicates();
        System.out.println(rev.removeDuplicates(array));
    }
}
