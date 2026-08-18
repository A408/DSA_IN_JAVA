class Solution {
    public String restoreString(String s, int[] indices) {
        String v="";
        char [] t = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            t[indices[i]]= s.charAt(i);
        }
        return String.valueOf(t);
            


        
    }
}