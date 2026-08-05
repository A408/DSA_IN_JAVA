class Solution {
    public boolean checkDuplicates(int[] arr) {
        boolean[] visited = new boolean[10001];
        
        for (int num : arr) {
            if (visited[num]) {
                return true;
            }
            visited[num] = true;
        }
        
        return false;
    }
}