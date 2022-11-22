class Solution {
	public boolean solution(String s) {
		int count = 0;
        char[] brck = s.toCharArray();
		for(char ch : brck) {
			if(ch=='(')	count++;
            if(ch==')') count--;
            if(count<0) break;
		}
		return count==0;
    }	
}
