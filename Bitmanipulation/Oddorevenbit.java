public class Oddorevenbit {
    public static void oddorevenbit(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddorevenbit(3);
        oddorevenbit(4);
    }
}