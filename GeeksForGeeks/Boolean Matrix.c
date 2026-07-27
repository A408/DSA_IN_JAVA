class Solution {
    void booleanMatrix(int mat[][]) {
        // code 
        int n = mat.length;
        boolean [] r = new boolean[n];
        boolean [] c = new boolean[n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++) {
                if(mat[i][j] ==1){
                  r[i]= true;
                  c[j]= true;
            }
        }
        
    }
    for(int i=0;i<n;i++){
        for(int j =0;j<n;j++){
            if(r[i] == true || c[j]== true) {
                mat[i][j] =1;
            }
        }
    }
}
}