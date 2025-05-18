public class Powerof2 {
    public static boolean ispowerof2(int n) {
        return (n & (n-1)) == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(ispowerof2(16));  // true
        System.out.println(ispowerof2(15));  // false
    }
} 