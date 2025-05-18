public class Clearrangeofbits {
    public static int clearrangeofbits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static void main(String[] args) {
        int n=29;
        int i=1;
        int j=3;
        System.out.println(clearrangeofbits(n,i,j));
    }
}