public class Prefixsubarraysum {
    public static void prefixsubarraysum(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                System.out.println(currsum);
                if(currsum>maxsum){
                maxsum=currsum;
            }
            }
            
        }
        System.out.println("Maximum sum is: "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60};
        prefixsubarraysum(numbers);
    }
}