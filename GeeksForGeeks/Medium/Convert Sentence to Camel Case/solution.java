class Solution {
    public String convertToCamelCase(String s) {
StringBuilder r = new StringBuilder();

boolean capitalize = false;

for (int i = 0; i < s.length(); i++) {

    char ch = s.charAt(i);

    if (ch == ' ') {
        capitalize = true;
    } 
    else {
        if (capitalize) {
            ch = Character.toUpperCase(ch);
            capitalize = false;
        }

        r.append(ch);
        
    }
}
return r.toString();
}
}