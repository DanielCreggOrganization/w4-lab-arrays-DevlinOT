package ie.atu.arrays;

public class Clone2 {
    public static void main(String[] args) {
        String[] original = {"red", "blue", "green", "violet", "indigo", "orange", "yellow"};
        String[] clone = original.clone();

        // Modify the clone
        clone[0] = "black";

        // Display both arrays
        System.out.println("Original array: " + java.util.Arrays.toString(original));
        System.out.println("Cloned array: " + java.util.Arrays.toString(clone));
    }
}
