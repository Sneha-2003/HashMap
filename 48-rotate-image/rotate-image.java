class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j<i)
                {
                    int t=matrix[i][j];
                    //System.out.println(t);
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=t;
                }
                
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                 int t=matrix[i][j];
                 matrix[i][j]=matrix[i][m-j-1];
                 matrix[i][m-j-1]=t;
            }
        }
    }
}