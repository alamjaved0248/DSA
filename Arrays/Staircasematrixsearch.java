public class Staircasematrixsearch {
    public static boolean staircasesearch(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        staircasesearch(matrix,10);
    }
}

//public class Staircasematrixsearch {
   // public static boolean staircasesearch(int matrix[][], int key) {
        //int row = matrix.length - 1;  // Start from bottom row
        //int col = 0;                  // Start from leftmost column
        
       //  while (row >= 0 && col < matrix[0].length) {
        //    if (matrix[row][col] == key) {
        //        System.out.println("Found at (" + row + "," + col + ")");
        //        return true;
           /// }
        //    else if (key < matrix[row][col]) {
        //        row--;  // Move up if key is smaller
        //    }
           // else {
        //        col++;  // Move right if key is larger
        //    }
        //}
        //System.out.println("Key not found");
        //return false;
    //}

    //public static void main(String[] args) {
        //int matrix[][] = {{1,2,3,4},
                         //{5,6,7,8},
                         //{9,10,11,12},
                         //{13,14,15,16}};
        //staircasesearch(matrix, 10);
    //}
//}