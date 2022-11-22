import java.util.*;
class Solution {
    public boolean check(int[] c, int[] y, int m) {
        int ca = 0, cb = 0;
        for(int i=0; i<c.length; i++) {
            if(c[i]%m==0 && y[i]%m!=0) {
                ca = i;
            } else {
                ca = 0;
                break;
            }
        }
        if(ca!=0)
            return true;
        for(int i=0; i<y.length; i++) {
            if(y[i]%m==0 && c[i]%m!=0) {
                cb = i;
            } else {
                cb = 0;
                break;
            }
        }
        if(cb!=0)
            return true;
        return false;
    }
    int bs(int[] arr1, int[] arr2) {
        int answer = 0;
        for(int i=(int)1e8; i>=1; i--) {
            if(check(arr1, arr2, i)) {
                answer = Math.max(i, answer);
            }
        }
        return answer;
    }
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = bs(arrayA, arrayB);
        return answer;
    }
}
