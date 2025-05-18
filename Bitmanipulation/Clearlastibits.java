public class Clearlastibits {
    public static int clearlastibits(int n,int i){
        int bitmask=(-1)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        int n=29;
        int i=2;
        System.out.println(clearlastibits(n,i));
    }
}