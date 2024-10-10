package ie.atu.arrays;

public class ArrayMethods2 {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] doubled = doubleArray(original);

        // Print the doubled array
        for (int num : doubled) {
            System.out.print(num + " ");
        }
    }

    public static int[] doubleArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * 2;
        }
        return result;
    }
}
