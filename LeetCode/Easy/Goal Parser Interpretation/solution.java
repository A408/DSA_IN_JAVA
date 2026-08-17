class Solution {
    public String interpret(String command) { 
        String s =  command.replace("()","o");
        String a = s.replace("(al)","al");
        return a;
        
    }
}