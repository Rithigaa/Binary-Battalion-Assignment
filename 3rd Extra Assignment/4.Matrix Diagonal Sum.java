class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat[0].length;i++){
            sum+=mat[i][i];
        }
        for(int i=0, j=mat[0].length-1;i<mat[0].length&&j>=0;i++,j--){
            sum+=mat[i][j];
        }
        if(mat[0].length%2!=0)
        {
            int m=(mat[0].length-1)/2;
            sum-=mat[m][m];
        }
        return sum;
    }
}