class Solution {
    public String maximumOddBinaryNumber(String  s) {
  StringBuilder sb = new StringBuilder();
  int c=0;
  for(int i =0;i<s.length();i++){
    char c1 = s.charAt(i);
    if(c1 == '1'){
        c++;
    }
    }
    for(int i=0;i<s.length();i++){
        if(i <c-1){
            sb.append('1');
        }
        else if (i < s.length() - 1) {
                sb.append('0');
        }
        else {
            sb.append('1');
        }
    }
return sb.toString();
        
    }
}