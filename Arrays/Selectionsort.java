public class Selectionsort {
    public static void selectionsort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[smallest]>numbers[j]){
                    smallest=j;
                }
            }
            int temp=numbers[smallest];
            numbers[smallest]=numbers[i];
            numbers[i]=temp;
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        selectionsort(numbers);
    }
}