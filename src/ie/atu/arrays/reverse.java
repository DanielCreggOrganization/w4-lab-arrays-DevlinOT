package ie.atu.arrays;

public class reverse {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

}
}
