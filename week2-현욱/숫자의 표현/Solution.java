class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] psum = new int[n+1];
        for(int i=1; i<=n; i++) {
            psum[i] = i;
            psum[i] += psum[i-1];
        }
        int left = 0, right = 1;
        while(left<n) {
            int calc = psum[right] - psum[left];
            if(calc<n) {
                right++;
            } else if(calc>n) {
                left++;
            } else {
                left++;
                answer++;
            }
        }
        return answer;
    }
}
