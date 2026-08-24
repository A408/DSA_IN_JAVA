class Solution {
    boolean isPalindrome(String s) {
        // code here
        int l =0;
        int r =s.length() -1;
        while(l<r){
            if (Character.toLowerCase(s.charAt(l))
            != Character.toLowerCase(s.charAt(r))) {
                return false;

            
        }
        l++;
        r--;
        }
        return true;
        
    }
}