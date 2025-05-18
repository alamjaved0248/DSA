public class Kadanesubarraysum {
    public static void kadanesubarraysum(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        boolean allNegative = true;
        int smallestNegative = Integer.MIN_VALUE;

        // First pass to check if all numbers are negative
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                allNegative = false;
                break;
            }
            smallestNegative = Math.max(smallestNegative, numbers[i]);
        }

        if (allNegative) {
            System.out.println("Maximum sum is: " + smallestNegative);
            return;
        }

        // Normal Kadane's algorithm for mixed or positive numbers
        for (int i = 0; i < numbers.length; i++) {
            currsum += numbers[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Maximum sum is: " + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanesubarraysum(numbers);
    }
}   