class Solution {
    public void reverseString(char[] s) {
        int s1 =0;
        int e = s.length-1;
        while(e>s1){
            char temp =s[s1];
            s[s1]= s[e];
            s[e]= temp;
            s1++;
            e--;
        }
        
    }
}