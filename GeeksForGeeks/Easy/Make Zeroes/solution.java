class Solution {
    public void makeZeros(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            temp[i] = mat[i].clone();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (temp[i][j] == 0) {
                    int sum = 0;
                    
                    if (i > 0) { 
                        sum += temp[i - 1][j];
                        mat[i - 1][j] = 0;
                        } 
                    if (i < n - 1) {
                        sum += temp[i + 1][j];
                        mat[i + 1][j] = 0;
                        } 
                    if (j > 0) {
                        sum += temp[i][j - 1];
                        mat[i][j - 1] = 0;
                        } 
                    if (j < m - 1) {
                        sum += temp[i][j + 1]; 
                        mat[i][j + 1] = 0;
                        } 
                    
                    mat[i][j] = sum;
                }
            }
        }
    }
}