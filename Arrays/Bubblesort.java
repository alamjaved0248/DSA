public class Bubblesort {
    public static void bubblesort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            int swaps=0;
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0){
                System.out.println("Array is already sorted");
                break;
            }
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        bubblesort(numbers);
    }
}
