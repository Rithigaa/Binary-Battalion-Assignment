class Solution {
    public int[][] transpose(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int g[][]=new int[m][n];
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=m-1;j++)
            {
                g[j][i]=grid[i][j];
            }
        }
        return g;

    }
}