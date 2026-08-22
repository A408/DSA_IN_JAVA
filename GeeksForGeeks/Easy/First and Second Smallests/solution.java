class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int s = arr[0];
        int ss = Integer.MAX_VALUE;
        ArrayList<Integer> sb = new  ArrayList<Integer>();
        for(int i =0;i<arr.length;i++){
            if(arr[i] < s) {
                ss =s;
                s=arr[i];
            }
            else if(arr[i] < ss && arr[i] !=s) {
                ss = arr[i];
            }
        }
        if(ss == Integer.MAX_VALUE){
            sb.add(-1);
            return sb;
        }
        sb.add(s);
        sb.add(ss);
        return sb;
    }
}
