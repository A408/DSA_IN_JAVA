class Solution {
    public String defangIPaddr(String address) {
     StringBuilder sc = new StringBuilder();
     for(int i =0;i<address.length();i++){
       char c = address.charAt(i);
       if(c == '.'){
        sc.append("[.]");
       }
       else{
        sc.append(c);
       }
     }
return sc.toString();
    
        
    }
}