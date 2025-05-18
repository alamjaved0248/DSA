import java.util.*;
public class Countsort {
    public static void countsort(int numbers[]) {
        // Find the range of numbers
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }
        
        // Create count array of size (max - min + 1)
        int range = max - min + 1;
        int count[] = new int[range];
        
        // Store count of each number
        for (int i = 0; i < numbers.length; i++) {
            count[numbers[i] - min]++;
        }
        
        // Reconstruct the array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                numbers[j] = i + min;  // Convert back to original number
                j++;
                count[i]--;
            }
        }
        
        System.out.println("Sorted array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = {-5, 4, -1, 3, 2, -4, 3, 7};
        countsort(numbers);
    }
}