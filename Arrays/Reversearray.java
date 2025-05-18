public class Reversearray {
    public static void reversearray(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60};
        reversearray(numbers);
        System.out.println("Reversed array is: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
} 