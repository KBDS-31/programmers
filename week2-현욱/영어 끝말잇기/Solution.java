import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        for(int i=1; i<words.length; i++) {
            if(set.contains(words[i])) {
                return new int[] {i%n+1, i/n+1};
            } else {
                char c = words[i-1].charAt(words[i-1].length()-1);
                if(words[i].charAt(0)!=c) {
                    return new int[] {i%n+1, i/n+1};        
                } else {
                    set.add(words[i]);
                }
            }
        }
        return new int[] {0, 0};
    }
}
