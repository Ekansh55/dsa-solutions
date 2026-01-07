class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++){
                matrix[top][i] = num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right] = num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }
}