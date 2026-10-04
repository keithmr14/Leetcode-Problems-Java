package medium;

import java.util.Arrays;

public class HIndex {

    public static int hIndex(int[] citations) {

        Arrays.sort(citations);
        int hIndex = 0;
        int n = citations.length;

        for(int i = n - 1; i >= 0; i--) {

            if(hIndex + 1 > citations[i]) break;

            hIndex++;
        }

        return hIndex;
    }

    public static void main(String[] args) {

        System.out.println("274. H-Index");

        // example 1
        int[] a1 = {3, 0, 6, 1, 5};
        System.out.println("\nArray: " + Arrays.toString(a1));
        System.out.println("H-Index: " + hIndex(a1));

        // example 2
        int[] a2 = {1, 3, 1};
        System.out.println("\nArray: " + Arrays.toString(a2));
        System.out.println("H-Index: " + hIndex(a2));
    }
}
