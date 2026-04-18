import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        System.out.println(Arrays.toString(digits) + " + 1");

        // start from the last digit
        int lastDig = digits.length - 1;

        digits[lastDig]++; // initiate first plus before deciding to carry

        while(lastDig != -1) { // while array index is >= 0

            if(digits[lastDig] == 10) {

                digits[lastDig] = 0;

                // if there's a corresponding elem to add carry
                if(lastDig != 0) digits[lastDig - 1]++;

                lastDig--;

            } else {
                System.out.println("= " + Arrays.toString(digits) + "\n");
                return digits;
            }
            // return at this point if there's no need to increase array size
        }

        // if left with a leading zero, increase array size and start with 1
        int[] incSize = new int[digits.length + 1];
        incSize[0] = 1;

        // copy old array numbers adjusting to right by 1 unit
        System.arraycopy(digits, 0, incSize, 1, digits.length);

        System.out.println("= " + Arrays.toString(incSize) + "\n");

        return incSize;
    }

    public static void main(String[] args) {

        System.out.println("66. Plus One\n");

        PlusOne pl = new PlusOne();

        // example 1
        int[] array = {1, 2, 3};
        pl.plusOne(array);

        // example 1
        int[] array2 = {9};
        pl.plusOne(array2);
    }

}
