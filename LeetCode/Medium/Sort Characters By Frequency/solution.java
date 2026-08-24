class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i)]++;
}
int m =0;
for (int i=0;i<s.length();i++ ){
    if(freq[s.charAt(i)] > m) {
        m = freq[s.charAt(i)];
    }
}

StringBuilder ans = new StringBuilder();
for (int f = m;f>=1;f--){
    for (int i = 0; i < 256; i++) {

        if (freq[i] == f) {
            for (int j = 0; j < f; j++) {
        ans.append((char)i);
            }
        }

            }
}
return ans.toString();

        
    }
}