public class TwoDArray2 {//find max of row and column
    public static void main(String[] args) {
        int[][] arr={{1,10,3,8},{9,12,6,7},{5,2,11,4}};
        findMaxOfRow(arr);
        findMaxOfColumn(arr);
    }

    private static void findMaxOfRow(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            int max=arr[i][0];
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max)
                    max=arr[i][j];
            }
            System.out.println("Maximum number of this row is "+max);
        }
    }
    private static void findMaxOfColumn(int[][] arr) {
        int k=0;
        for(int i=0;i<arr[k].length;i++){
            int max=arr[0][i];
            for(int j=0;j<arr.length;j++){
                if(arr[j][i]>max)
                    max=arr[j][i];
            }
            System.out.println("Maximum number of this column is "+max);
            k=k<arr.length?k++:k;
        }
    }
    
}
