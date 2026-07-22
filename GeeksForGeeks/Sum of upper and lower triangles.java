class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        int n = mat.length;
        int sum =0;
         ArrayList<Integer> arr = new  ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j =n-1;j>=i;j--){
                sum +=mat[i][j];
            }
        }
            arr.add(sum);
            sum =0;
           for(int i=0;i<n;i++){
            for(int j = 0;j<=i;j++){
                sum +=mat[i][j];
            }
           }
            arr.add(sum);
            return arr;
        
    }
}