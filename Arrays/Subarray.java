import java.util.*;
public class Subarray {
    public static void subarray(int numbers[]){
        int sum
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }

                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60};
        subarray(numbers);
    }
}