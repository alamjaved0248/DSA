import java.util.*;
public class Largestarray {
    public static int largestarray(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60};
        int largest = largestarray(numbers);
        System.out.println("Largest number is: "+largest);
    }
}