class Solution {
    public String reverseVowels(String s) {
        char [] c = s.toCharArray();
        int l =0;
        int r = c.length-1;

        while(l<=r){
          
            
          while( l<= r && ! (c[l]=='A' || c[l]=='E' || 
            c[l]=='I' || 
            c[l]=='O' || c[l]=='U' || c[l]=='a' || c[l]=='e' || 
            c[l]=='i' || c[l]=='o' || c[l]=='u')) {
                l++;
            }
            while (l<=r &&! (c[r]=='A' || c[r]=='E' || c[r]=='I' || 
            c[r]=='O' || c[r]=='U' || c[r]=='a' || c[r]=='e' || 
            c[r]=='i' || c[r]=='o' || c[r]=='u')){
                r--;
            }  if(l<=r){

                        char ch = c[l];
                        c[l] = c[r];
                        c[r] = ch;
                        l++;
                        r--;
        }
        }
       
        return new String(c);
    }
}