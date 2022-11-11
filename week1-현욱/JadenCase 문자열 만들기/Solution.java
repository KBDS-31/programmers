import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] cstr = s.toLowerCase().toCharArray();
        boolean check = true;
        for(char c: cstr) {
            sb.append(check ? Character.toUpperCase(c) : c);
            check = (c==' ');
        }
        return sb.toString();
    }
}
