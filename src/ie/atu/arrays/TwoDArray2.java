package ie.atu.arrays;

public class TwoDArray2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] matrix = {
            {1, 2, 3}, // Row 0
            {4, 5, 6}, // Row 1
            {7, 8, 9}  // Row 2
        };

        

        

        // Displaying the 2D array
        for (int i = 0; i < matrix.length; i++) { // Rows
            for (int j = 0; j < matrix[i].length; j++) { // Columns
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
