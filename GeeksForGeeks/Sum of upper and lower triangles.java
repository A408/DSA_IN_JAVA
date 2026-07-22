class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        int upper = 0;
        int lower = 0;
        int n = mat.length;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {

                if (i == j) {
                    upper += mat[i][j];
                    lower += mat[i][j];
                }

                else if (j > i)
                    upper += mat[i][j];

                else if (j < i)
                    lower += mat[i][j];
            }
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(upper);
        result.add(lower);
        return result;
    }
}