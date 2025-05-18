public class Insertionsort {
    public static void insertionsort(int numbers[]){
        for(int i=1;i<numbers.length;i++){
            int current=numbers[i];
            int j=i-1;
            while(j>=0 && numbers[j]>current){
                numbers[j+1]=numbers[j];
                j--;
            }
            numbers[j+1]=current;
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        insertionsort(numbers);
    }
}