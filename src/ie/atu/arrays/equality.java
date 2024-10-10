package ie.atu.arrays;

import java.util.Arrays;

public class equality {
 public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] num = {5, 6, 7, 8, 9};
        boolean index = Arrays.equals(numbers, num);
        System.out.println("Are array 1 and 2 equal " + index);
    }
}
