import java.util.Arrays;

public class MinMaxCalculation {

    // Method to compute the minimum value
    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to compute the maximum value
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Main method for testing the functionality
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 5, 3, 9, 2, 8, -1, 4};

        // Find and print min and max
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

