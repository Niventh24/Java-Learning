public class TwoDArray {//sum of rows or columns of 2d array
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        sumOfRowsOfArray(arr);
        sumOfColumnsOfArray(arr);
    }

    private static void sumOfRowsOfArray(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("Sum of rows of an 2-D array is "+sum);
        }  
    }

    private static void sumOfColumnsOfArray(int[][] arr) {
        int k=0;
        for(int i=0;i<arr[k].length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j][i];
            }
            System.out.println("Sum of columns of an 2-D array is "+sum);
            k=k<arr.length?k++:k;
        }
    }
    
}
