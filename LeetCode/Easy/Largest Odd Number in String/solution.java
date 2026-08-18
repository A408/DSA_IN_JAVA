class Solution {
    public String largestOddNumber(String num) {
       for(int i=num.length()-1;i>=0;i--){
        if(num.charAt(i) %2 != 0){
            return num;
        }
        else {
            num = num.substring(0,num.length()-1);
        }
       }
       return num;
        
    }
}