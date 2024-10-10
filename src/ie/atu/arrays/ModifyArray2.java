package ie.atu.arrays;

public class ModifyArray2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        numbers[2] = 35; // Modifies the second element

        // Displaying modified array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
