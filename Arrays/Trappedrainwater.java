public class Trappedrainwater {
    public static void trappedrainwater(int height[]){
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        System.out.println("Left max array is: ");
        for(int i=0;i<n;i++){
            System.out.print(leftmax[i]+" ");
        }
        System.out.println();
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        System.out.println("Right max array is: ");
        for(int i=0;i<n;i++){
            System.out.print(rightmax[i]+" ");
        }
        System.out.println();
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        System.out.println("Trapped water is: "+trappedwater);
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trappedrainwater(height);
    }
}