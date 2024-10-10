package ie.atu.arrays;

import java.util.Arrays;

public class CopyingAndSorting {
    public static void main(String[] args) {
    int[] original = {1, 2, 3};
    int[] copy = new int[original.length];

    System.arraycopy(original, 0, copy, 0, original.length);

    // Modify the copy
    copy[0] = 10;

    // Display both arrays
    System.out.println("Original array: " + java.util.Arrays.toString(original));
    System.out.println("Copied array: " + java.util.Arrays.toString(copy));
    Arrays.sort(copy);
        System.out.println("Sorted array: " + Arrays.toString(copy));
}

}
