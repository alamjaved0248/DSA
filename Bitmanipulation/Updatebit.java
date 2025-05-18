public class Updatebit {
    public static int updatebit(int n, int i, int newbit) {
        // First clear the bit
        n = clearbit(n, i);
        // Then set the new bit
        int bitmask = newbit << i;
        return n | bitmask;
    }
    
    public static int clearbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    
    public static void main(String[] args) {
        System.out.println(updatebit(10, 2, 1));  // Example: updating 3rd bit of 10 to 1
    }
} 