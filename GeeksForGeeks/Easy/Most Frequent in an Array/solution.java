class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Arrays.sort(arr);
        int maxcount = 1;
        int res = arr[0];
        int count =1;
        for (int i = 1; i < arr.length; i++)  {
                if (arr[i] == arr[i-1]){
                    count++;
            }
            else {
                count =1;
            }
            if (count >= maxcount) {
                maxcount = count;
                res = arr[i];
            }
        }

        return res;
    }
}