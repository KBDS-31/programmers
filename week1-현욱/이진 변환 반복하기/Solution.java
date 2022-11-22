class Solution {
    public int[] solution(String s) {
        int conv = 0, zero = 0; 
        while(!s.equals("1")) {
            int z = getZero(s);
            s = Integer.toBinaryString(s.length()-z);
            conv++;
            zero+=z;
        }
        return new int[] {conv, zero};
    }
    int getZero(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='0')
                count++;
        }
        return count;
    }
}
